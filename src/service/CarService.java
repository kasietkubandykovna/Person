package service;

import models.Car;

import java.util.List;

public interface CarService {
    void saveCar(Car car);
    List<Car> getCarByPersonId(Long personId);
    Car getCarById(Long id);
    void updateCarById(Long id,String newName,String newmodel);
    String deleteCarById(Long id);
}
