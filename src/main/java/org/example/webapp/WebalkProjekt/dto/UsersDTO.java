package org.example.webapp.WebalkProjekt.dto;

public class UsersDTO {

  private Long id;

  private String username;

  private String password;

  private boolean teacher;

  public UsersDTO() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isTeacher() {
    return teacher;
  }

  public void setTeacher(boolean teacher) {
    this.teacher = teacher;
  }
}
