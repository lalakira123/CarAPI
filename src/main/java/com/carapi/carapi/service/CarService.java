package com.carapi.carapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapi.carapi.dto.CarDTO;
import com.carapi.carapi.model.Car;
import com.carapi.carapi.repository.CarRepository;

@Service
public class CarService {
  
  @Autowired
  private CarRepository repository;

  public List<Car> findAll() {
    return repository.findAll();
  }

  public Car save(CarDTO dto) {
    return repository.save(new Car(dto));
  }

  public void findById(Long id, CarDTO dto) {
    repository.findById(id).map(car -> {
      car.setAnoModelo(dto.anoModelo());
      car.setDataFabricacao(dto.dataFabricacao());
      car.setFabricante(dto.fabricante());
      car.setModelo(dto.modelo());
      car.setValor(dto.valor());
      return repository.save(car);
    });
  }

  public void deleteById(Long id) {
    repository.deleteById(id);
  }

}
