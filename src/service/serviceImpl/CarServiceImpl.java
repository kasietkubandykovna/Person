package service.serviceImpl;

import dao.CarDao;
import dao.daoImpl.CarDaoIMpl;
import models.Car;
import service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao=new CarDaoIMpl();
    @Override
    public void saveCar(Car car) {
        carDao.saveCar(car);
    }

    @Override
    public List<Car> getCarByPersonId(Long personId) {
        return carDao.getCarByPersonId(personId);
    }

    @Override
    public Car getCarById(Long id) {
        return carDao.getCarById(id);
    }

    @Override
    public void updateCarById(Long id, String newName, String newmodel) {
carDao.updateCarById(id,newName,newmodel);
    }

    @Override
    public String deleteCarById(Long id) {
        return carDao.deleteCarById(id);
    }
}
