package dao.daoImpl;

import dao.CarDao;
import datebase.DateBase;
import models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoIMpl implements CarDao {

public static long carIdCounter = 0;
    @Override
    public void saveCar(Car car) {
        car.setId(++carIdCounter);
        DateBase.cars.add(car);
        System.out.println("Car saved: " + car);
    }

    @Override
    public List<Car> getCarByPersonId(Long personId) {
        List<Car> carsByPersonId = new ArrayList<>();
        for (Car car :DateBase.cars) {
            if (car.getId().equals(personId)) {
                carsByPersonId.add(car);
            }
        }
        return carsByPersonId;
    }

    @Override
    public Car getCarById(Long id) {
        for (Car car : DateBase.cars) {
            if (car.getId().equals(id)) {
                return car;
    }
        }
    return null;
    }

    @Override
    public void updateCarById(Long id, String newName, String newmodel) {
        for (Car car : DateBase.cars) {
            if (car.getId().equals(id)) {
                car.setName(newName);
                car.setModel(newmodel);
                System.out.println("Car updated: " + car);

    }}}

    @Override
    public String deleteCarById(Long id) {
        for (Car car : DateBase.cars) {
            if (car.getId().equals(id)) {
                DateBase.cars.remove(car);
                System.out.println("Car deleted: " + car);
            }
        }
        return null;
    }}