package org.example.webapp.WebalkProjekt.service.impl;

import org.example.webapp.WebalkProjekt.dto.SessionDTO;
import org.example.webapp.WebalkProjekt.dto.UsersDTO;
import org.example.webapp.WebalkProjekt.entity.SessionEntity;
import org.example.webapp.WebalkProjekt.entity.UsersEntity;
import org.example.webapp.WebalkProjekt.repository.SessionRepo;
import org.example.webapp.WebalkProjekt.repository.UsersRepo;
import org.example.webapp.WebalkProjekt.service.UsersService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

  private UsersRepo usersRepo;
  private SessionRepo sessionRepo;
  private ModelMapper modelMapper;

  public UsersServiceImpl(UsersRepo usersRepo, SessionRepo sessionRepo, ModelMapper modelMapper) {
    this.usersRepo = usersRepo;
    this.modelMapper = modelMapper;
    this.sessionRepo = sessionRepo;

//    UsersEntity usersEntity = new UsersEntity();
//    UsersEntity usersEntity2 = new UsersEntity();
//    usersEntity.setUsername("Tamás");
//    usersEntity2.setUsername("Csabi");
//    usersEntity.setPassword("asd123");
//    usersEntity2.setPassword("fgh456");
//    usersRepo.save(usersEntity);
//    usersRepo.save(usersEntity2);
  }

  @Override
  public Optional<UsersDTO> findByUsernameAndPassword(String username, String password) {

    Optional<UsersEntity> usersEntityOptional = Optional.ofNullable(usersRepo.findByUsernameAndPassword(username, password));

      Optional<UsersDTO> usersDTO1 = usersEntityOptional.map(usersEntity -> modelMapper.map(usersEntity, UsersDTO.class));

      return usersDTO1;
  }

  @Override
  public Optional<UsersDTO> findByUsername(String username) {
    Optional<UsersEntity> usersEntityOptional = Optional.ofNullable(usersRepo.findByUsername(username));

    Optional<UsersDTO> usersDTO1 = usersEntityOptional.map(usersEntity -> modelMapper.map(usersEntity, UsersDTO.class));

    return usersDTO1;
  }

  public String getSessionUsername() {

    List<SessionEntity> sessionUser = sessionRepo.findAll();

    List<SessionDTO> result = new ArrayList<>();

    String sessionUsername = null;
    
    for(SessionEntity sessionEntity : sessionUser)
    {
      SessionDTO sessionDTO = modelMapper.map(sessionEntity, SessionDTO.class);
      sessionUsername = sessionDTO.getUsername();
    }

    


    return sessionUsername;
  }

  @Override
  public void save(String username, String password, boolean teacher) {
    UsersDTO usersDTO = new UsersDTO();
    usersDTO.setUsername(username);
    usersDTO.setPassword(password);
    usersDTO.setTeacher(teacher);

    UsersEntity usersEntity = modelMapper.map(usersDTO, UsersEntity.class);

    usersRepo.save(usersEntity);

  }

  @Override
  public void saveSession(String username) {
    SessionDTO sessionDTO = new SessionDTO();
    sessionDTO.setUsername(username);

    SessionEntity sessionEntity = modelMapper.map(sessionDTO, SessionEntity.class);

    sessionRepo.save(sessionEntity);
  }

  @Override
  public void deleteAll() {
    List<SessionEntity> sessionEntity = sessionRepo.findAll();
    if(!sessionEntity.isEmpty())
    {
      sessionRepo.deleteAll();
    }
  }

  @Override
  public boolean isTeacher(String username) {

    UsersEntity sessionUser = usersRepo.findByUsername(username);

    return sessionUser.isTeacher();
  }

}
