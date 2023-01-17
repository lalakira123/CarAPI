package com.carapi.carapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carapi.carapi.dto.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {
  
  @PostMapping
  public void create(@RequestBody CarDTO req) {
    System.out.println(req.modelo());
    System.out.println(req.fabricante());
    System.out.println(req.anoModelo());
  }

}
