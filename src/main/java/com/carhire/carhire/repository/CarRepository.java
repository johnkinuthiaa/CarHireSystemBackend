package com.carhire.carhire.repository;

import com.carhire.carhire.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car,Long> {
    Optional<Car>findCarByBrandName(String name);
}
