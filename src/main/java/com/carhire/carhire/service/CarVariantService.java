package com.carhire.carhire.service;

import com.carhire.carhire.models.CarVariant;

import java.util.List;

public interface CarVariantService {
    CarVariant createNewCarVariant(CarVariant carVariantDetails,Long id);
    CarVariant updateExistingCarVariant(CarVariant carVariantDetails,Long id);
    List<CarVariant> getVariantByName(String name);
    List<CarVariant> getVariantByFuelType(String type);
    List<CarVariant> getVariantByCompany(String company);
    List<CarVariant> getVariantBySeatCapacity(Integer seats);
    List<CarVariant> getVariantByHasAc(Boolean hasAc);


}
