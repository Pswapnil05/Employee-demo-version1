package com.innovect.project.employee;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Date;

public class DrivdrNotFound extends RuntimeException {

  public DrivdrNotFound(String message){
  }

  @Override
  public String getMessage() {
    Error error = new Error("Driver not found",401, new Date().getTime()+"");
    return error.toString();
  }

}
