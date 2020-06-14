package pl.adcom.teai_jdbctemplate_car.dao;

import pl.adcom.teai_jdbctemplate_car.model.Car;

import java.util.List;

public interface CarDao {
    void saveCar(Car car);
    List<Car> findAll();
    void updateCar(Car car);
    void deleteCar(Car car);
}
