package com.carapi.carapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carapi.carapi.dto.CarDTO;
import com.carapi.carapi.model.Car;
import com.carapi.carapi.service.CarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/car")
public class CarController {
  
  @Autowired
  private CarService service;

  @GetMapping
  public List<Car> listAll() {
    return service.findAll();
  }

  @PostMapping
  public void create(@RequestBody @Valid CarDTO req) {
    service.save(req);
  }

  @PutMapping("/{id}")
  public void update(@PathVariable Long id, @RequestBody @Valid CarDTO req) {
    service.findById(id, req);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    service.deleteById(id);
  }

}
