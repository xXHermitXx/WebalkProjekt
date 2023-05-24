package org.example.webapp.WebalkProjekt.service.impl;

import org.example.webapp.WebalkProjekt.dto.UsersDTO;
import org.example.webapp.WebalkProjekt.entity.UsersEntity;
import org.example.webapp.WebalkProjekt.repository.UsersRepo;
import org.example.webapp.WebalkProjekt.service.UsersService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

  private UsersRepo usersRepo;
  private ModelMapper modelMapper;

  public UsersServiceImpl(UsersRepo usersRepo, ModelMapper modelMapper) {
    this.usersRepo = usersRepo;
    this.modelMapper = modelMapper;

    UsersEntity usersEntity = new UsersEntity();
    UsersEntity usersEntity2 = new UsersEntity();
    usersEntity.setUsername("Tamás");
    usersEntity2.setUsername("Csabi");
    usersEntity.setPassword("asd123");
    usersEntity2.setPassword("fgh456");
    usersRepo.save(usersEntity);
    usersRepo.save(usersEntity2);
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

  @Override
  public void save(String username, String password) {
    UsersDTO usersDTO = new UsersDTO();
    usersDTO.setUsername(username);
    usersDTO.setPassword(password);

    UsersEntity usersEntity = modelMapper.map(usersDTO, UsersEntity.class);

    usersRepo.save(usersEntity);

  }

}
