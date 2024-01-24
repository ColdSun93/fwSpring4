package ru.coldsun.homework4.services;

import org.springframework.stereotype.Service;
import ru.coldsun.homework4.model.Car;
import java.util.List;
import java.util.ArrayList;

@Service
public class CarService {
    List<Car> cars = new ArrayList<>();

    public List<Car> getAllCar() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
