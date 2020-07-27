package web.service;

import web.model.Car;
import java.util.Arrays;
import java.util.List;

public class CarService {

    public List<Car> getCars() {
        return Arrays.asList(new Car("Toyota", "Land Cruiser", 1),
                new Car("Honda", "Pilot", 2),
                new Car("Mitsubishi", "Pajeiro", 3));
    }
}
