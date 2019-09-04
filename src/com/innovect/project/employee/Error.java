package com.innovect.project.employee;

public class Error {
  public Error(String message, int statusCode, String time) {
    this.message = message;
    this.statusCode = statusCode;
    this.time = time;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  private String message;
  private int statusCode;
  private String time;
}
