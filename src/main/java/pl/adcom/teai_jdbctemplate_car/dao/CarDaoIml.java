package pl.adcom.teai_jdbctemplate_car.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;
import pl.adcom.teai_jdbctemplate_car.config.DbConfig;
import pl.adcom.teai_jdbctemplate_car.model.Car;
import pl.adcom.teai_jdbctemplate_car.model.Color;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public class CarDaoIml implements CarDao {

    private DbConfig dbConfig;

    @Autowired
    public CarDaoIml(DbConfig dbConfig) {
        this.dbConfig = dbConfig;
    }

    @Override
    public void saveCar(Car car) {
        String sql = "INSERT INTO car VALUES(?, ?, ?, ?)";
        dbConfig.getJdbcTemplate().update(sql, car.getMark(), car.getModel(), car.getColor(), car.getProductionDate());
    }

    @Override
    public List<Car> findAll() {

        List<Car> carList = new ArrayList<>();
        String sql = "SELECT * from car";
        List<Map<String, Object>> maps = dbConfig.getJdbcTemplate().queryForList(sql);

        maps.stream().forEach(e -> carList.add(new Car(
                Long.parseLong(String.valueOf(e.get("car_id"))),
                String.valueOf(e.get("mark")),
                String.valueOf(e.get("model")),
                Color.valueOf(String.valueOf(e.get("color"))),
                Integer.parseInt(String.valueOf(e.get("productionDate")))
        )));

        return carList;
    }

    @Override
    public void updateCar(Car car) {

    }

    @Override
    public void deleteCar(Car car) {

    }
}
