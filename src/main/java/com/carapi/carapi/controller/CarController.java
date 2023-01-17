package com.carapi.carapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carapi.carapi.dto.CarDTO;
import com.carapi.carapi.model.Car;
import com.carapi.carapi.repository.CarRepository;

@RestController
@RequestMapping("/api/car")
public class CarController {
  
  @Autowired
  private CarRepository repository;

  @GetMapping
  public List<Car> listAll() {
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    repository.save(new Car(req));
  }

}
