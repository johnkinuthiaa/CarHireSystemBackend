package com.carhire.carhire.repository;

import com.carhire.carhire.models.CarVariant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarVariantRepository extends JpaRepository<CarVariant,Long> {
}
