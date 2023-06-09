package org.example.webapp.WebalkProjekt.controller;

import org.example.webapp.WebalkProjekt.dto.SessionDTO;
import org.example.webapp.WebalkProjekt.dto.UsersDTO;
import org.example.webapp.WebalkProjekt.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/uni")
public class UniversityController {

  private UsersService usersService;

  public UniversityController(UsersService usersService) {
    this.usersService = usersService;
  }

  @RequestMapping(path = "/log", method = RequestMethod.POST)
  public ResponseEntity<String> findByUsernameAndPassword(@RequestParam String username, @RequestParam String password) {

    Optional<UsersDTO> usersDTO1 = usersService.findByUsernameAndPassword(username, password);

    ResponseEntity<String> response;

    if(usersDTO1.isPresent()){
      usersService.deleteAll();
      usersService.saveSession(username);
      String sessionUsername = usersService.getSessionUsername();
      if(usersService.isTeacher(sessionUsername))
      {
        response = ResponseEntity.ok("Sikeres belépés! " + sessionUsername + " tanár!");
      }
      else
      {
        response = ResponseEntity.ok("Sikeres belépés! " + sessionUsername + " Nem tanár!");
      }
    } else {
      response = ResponseEntity.status(404).body("Sikertelen belépés!");
    }
    return  response;
  }

  @RequestMapping(path = "/reg", method = RequestMethod.POST)
  public ResponseEntity<String> save(@RequestParam String username, @RequestParam String password, @RequestParam boolean teacher){

    Optional<UsersDTO> usersDTO1 = usersService.findByUsername(username);

    ResponseEntity<String> response;

    if(usersDTO1.isPresent()){
      response = ResponseEntity.status(404).body("Már létező felhasználó");

    } else {
      usersService.save(username, password, teacher);
      response = ResponseEntity.ok("Sikeres regisztráció");
    }
    return response;
  }

}
