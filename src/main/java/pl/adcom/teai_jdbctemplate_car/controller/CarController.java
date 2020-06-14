package pl.adcom.teai_jdbctemplate_car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.adcom.teai_jdbctemplate_car.dao.CarDao;

@Controller
public class CarController {

    private CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping
    public String getPage(Model model){
        model.addAttribute("cars", carDao.findAll());
        return "car";
    }
}
