package com.cars.carsapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager {

    private List<Car> carList;

    public CarManager() {
        this.carList = new ArrayList<>();
        carList.add(new Car("VW","Polo"));
        carList.add(new Car("Daewoo","Matiz"));
        carList.add(new Car("Toyota","Yaris"));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public boolean addCar(Car car){
        return carList.add(car);
    }
}
