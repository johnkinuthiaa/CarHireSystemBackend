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
//    List<CarVariant> getVariantByFuelType(String type);
//    List<CarVariant> getVariantByCompany(String company);
//    List<CarVariant> getVariantBySeatCapacity(Integer seats);
//    List<CarVariant> getVariantByHasAc(Boolean hasAc)

}
