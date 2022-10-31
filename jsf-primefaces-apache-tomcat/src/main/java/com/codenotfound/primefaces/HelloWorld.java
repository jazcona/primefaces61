package com.codenotfound.primefaces;

import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {
  private CarService service;

  private String firstName = "John";
  private String lastName = "Doe";
  private List<Car> cars;

  public List<Car> getCars() {
    service = new CarService();
    cars = service.createCars(10);
    return cars;
  }

  public void setCars(List<Car> cars) {
    this.cars = cars;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    return "Hello " + firstName + " " + lastName + "!";
  }
}
