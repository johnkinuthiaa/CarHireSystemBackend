package com.carhire.carhire.controller;

import com.carhire.carhire.models.Car;
import com.carhire.carhire.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")

public class CarController {
    private final CarService service;
    public CarController(CarService service){
        this.service=service;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCars(){
        return ResponseEntity.ok(service.getAllCars());
    }
    @GetMapping("/brand")
    public ResponseEntity<List<Car>> getCarsByBrand(@RequestParam String brandName){
        return ResponseEntity.ok(service.getCarsByBrand(brandName));
    }
    @PostMapping("/new/car")
    public ResponseEntity<Car> createNewCar(@RequestBody Car carDetails){
        return ResponseEntity.ok(service.createNewCar(carDetails));
    }
    @DeleteMapping("/delete/brands")
    public void deleteCarByBrand(@RequestParam String name){
        service.deleteCarByBrand(name);
    }
}
