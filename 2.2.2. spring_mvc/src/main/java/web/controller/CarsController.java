package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarService service;

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        List<Car> cars = service.getCars();
        model.addAttribute("cars", cars);
        return "cars";
    }
}
