package org.example.webapp.WebalkProjekt.repository;

import org.example.webapp.WebalkProjekt.entity.SessionEntity;
import org.example.webapp.WebalkProjekt.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<UsersEntity, Long> {

  UsersEntity findByUsernameAndPassword(String username, String password);

  UsersEntity findByUsername(String username);

  //String getSessionUsername();
}
