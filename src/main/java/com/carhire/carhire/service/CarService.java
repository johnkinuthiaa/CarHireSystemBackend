package com.carhire.carhire.service;


import com.carhire.carhire.models.Car;

import java.util.List;

public interface CarService {
    Car createNewCar(Car carDetails);
    List<Car> getAllCars();
    void deleteCarByBrand(String name);
    List<Car> getCarsByBrand(String brandName);
}
