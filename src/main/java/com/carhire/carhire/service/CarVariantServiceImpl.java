package com.carhire.carhire.service;

import com.carhire.carhire.models.CarVariant;
import com.carhire.carhire.repository.CarVariantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarVariantServiceImpl implements CarVariantService{
    private final CarVariantRepository repository;
    public CarVariantServiceImpl(CarVariantRepository repository){
        this.repository=repository;
    }

    @Override
    public CarVariant createNewCarVariant(CarVariant carVariantDetails,Long id) throws RuntimeException{
        if(repository.findById(id).isPresent()){
            throw new RuntimeException("object already exists");
        }
        return repository.save(carVariantDetails);
    }
    @Override
    public CarVariant updateExistingCarVariant(CarVariant carVariantDetails,Long id){
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("car variant with id"+id+"does not exist");
        }else{
            repository.delete(repository.findById(id).orElseThrow());
        }
        return repository.save(carVariantDetails);

    }

    @Override
    public List<CarVariant> getVariantByName(String name) {
        return repository.findAll().stream()
                .filter(carVariant -> carVariant.getVariantName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CarVariant> getVariantByFuelType(String type) {
        return repository.findAll().stream()
                .filter(carVariant -> carVariant.getFuelType().toLowerCase().contains(type.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CarVariant> getVariantByCompany(String company) {
        return repository.findAll().stream()
                .filter(carVariant -> carVariant.getFuelType().toLowerCase().contains(company.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CarVariant> getVariantBySeatCapacity(Integer seats) {
        return repository.findAll().stream()
                .filter(carVariant -> carVariant.getFuelType().equalsIgnoreCase(seats.toString()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CarVariant> getVariantByHasAc(Boolean hasAc) {
        return repository.findAll().stream()
                .filter(carVariant -> carVariant.getHasAc().equals(hasAc))
                .collect(Collectors.toList());
    }
}
