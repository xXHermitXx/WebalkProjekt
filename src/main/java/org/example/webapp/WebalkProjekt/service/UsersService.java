package org.example.webapp.WebalkProjekt.service;

import org.example.webapp.WebalkProjekt.dto.UsersDTO;

import java.util.Optional;

public interface UsersService {

  Optional<UsersDTO> findByUsernameAndPassword(String username, String password);

  Optional<UsersDTO> findByUsername(String username);

  void save(String username, String password);

}
