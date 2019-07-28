package com.cars.carsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarApi {

    CarManager carManager;

    @Autowired
    public CarApi(CarManager carManager){
        this.carManager = carManager;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/getCars")
    public List<Car> getCars(){
        return carManager.getCarList();
    }

    @PostMapping("/addCar")
    public boolean addCar(@RequestBody Car car){
        return carManager.addCar(car);
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name){
        return "Hello " + name;
    }
}
