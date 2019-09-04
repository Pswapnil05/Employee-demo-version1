package com.innovect.project.employee;

public class Gen {
  static <T> void genericDisplay(T element) {
    System.out.println(element);
  }

  public static void main(String[] args) {
    genericDisplay(8);
    genericDisplay(2.0);
    genericDisplay("version");
  }


}
