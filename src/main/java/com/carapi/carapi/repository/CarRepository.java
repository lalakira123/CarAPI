package com.carapi.carapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carapi.carapi.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
  
}
