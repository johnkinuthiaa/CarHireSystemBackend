package com.carhire.carhire.service;

import com.carhire.carhire.models.Car;
import com.carhire.carhire.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    private final CarRepository repository;
    public CarServiceImpl(CarRepository repository){
        this.repository=repository;
    }

    @Override
    public Car createNewCar(Car carDetails) {
        return repository.save(carDetails);
    }

    @Override
    public List<Car> getAllCars() {
        return repository.findAll();
    }

    @Override
    public void deleteCarByBrand(String name) {
        List<Car> cars= repository.findAll().stream()
                .filter(car->car.getBrandName().equalsIgnoreCase(name.toLowerCase()))
                .collect(Collectors.toList());
        repository.deleteAll(cars);
    }

    @Override
    public List<Car> getCarsByBrand(String brandName) {
        return repository.findAll().stream()
                .filter(car->car.getBrandName().toLowerCase().contains(brandName.toLowerCase()))
                .collect(Collectors.toList());
    }
}
