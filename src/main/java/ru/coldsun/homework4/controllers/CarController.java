package ru.coldsun.homework4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.coldsun.homework4.model.Car;
import ru.coldsun.homework4.services.CarService;

@Controller
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @RequestMapping("/index")
    public String helloWorld() {
        return "index.html";
    }

    @GetMapping("/dealership")
    public String getCars(Model model){
        model.addAttribute("dealership", carService.getAllCar());
        return "dealership";
    }

    @PostMapping("/dealership")
    public String addProduct(Car car, Model model){
        carService.addCar(car);
        model.addAttribute("dealership", carService.getAllCar());
        return "dealership";
    }

}
