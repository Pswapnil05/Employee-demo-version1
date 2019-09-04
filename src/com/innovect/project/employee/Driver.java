package com.innovect.project.employee;

public class Driver {

  public Driver(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  private int id ;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;
}
