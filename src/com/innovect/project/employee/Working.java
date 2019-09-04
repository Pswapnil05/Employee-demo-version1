package com.innovect.project.employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Working {
  public static Working working = null;

  public static void main(String[] args){

    try {
      User user = new User();
      user.getDrivers();
    }catch (Exception e){
      System.out.println(e.getMessage());
      System.out.println(e.getCause());
      System.out.println("=======");
      e.printStackTrace();
      System.out.println("=======");
    }



    System.out.println("Finish");
  }



}
