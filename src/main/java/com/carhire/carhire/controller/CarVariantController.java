package com.carhire.carhire.controller;

import com.carhire.carhire.models.CarVariant;
import com.carhire.carhire.service.CarVariantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/variants")
public class CarVariantController {
    private final CarVariantService service;
    public CarVariantController(CarVariantService service){
        this.service=service;
    }
    @PostMapping("/create/variants")
    public ResponseEntity <CarVariant> createNewCarVariant(@RequestBody CarVariant carVariantDetails, @RequestParam Long id){
        return ResponseEntity.ok(service.createNewCarVariant(carVariantDetails,id));
    }
    @PutMapping("/update/variants")
    public ResponseEntity<CarVariant> updateExistingCarVariant(@RequestBody CarVariant carVariantDetails, @RequestParam Long id){
        return ResponseEntity.ok(service.updateExistingCarVariant(carVariantDetails,id));
    }
    @GetMapping("/get/name")
    public ResponseEntity<List<CarVariant>> getVariantByName(@RequestParam String name){
        return ResponseEntity.ok(service.getVariantByName(name));
    }
    @GetMapping("/get/fuelType")
    public ResponseEntity<List<CarVariant>> getVariantByFuelType(@RequestParam String type){
        return ResponseEntity.ok(service.getVariantByFuelType(type));
    }
    @GetMapping("/get/company")
    public ResponseEntity<List<CarVariant>> getVariantByCompany(@RequestParam String company){
        return ResponseEntity.ok(service.getVariantByCompany(company));
    }
    @GetMapping("/get/seats")
    public ResponseEntity<List<CarVariant>> getVariantBySeatCapacity(@RequestParam  Integer seats){
        return ResponseEntity.ok(service.getVariantBySeatCapacity(seats));
    }
    @GetMapping("/get/hasAc")
    public  ResponseEntity<List<CarVariant>> getVariantByHasAc(@RequestParam Boolean ac){
        return ResponseEntity.ok(service.getVariantByHasAc(ac));
    }


}
