package com.carhire.carhire.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brandName;
    private String brandLogo;
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "Car", cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private List<CarVariant> carVariants;
}
