package com.carhire.carhire.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class CarVariantReqRes {
    private int statusCode;
    private String error;
    private String message;
    private Long id;
    private String variantName;
    private String variantDescription;
    private String company;
    private String modelNumber;
    private Integer year;
    private String fuelType;
    private Boolean hasAc;
    private Integer seatCapacity;
    private BigDecimal rentPerDay;
    private String imgUrl;
    private LocalDateTime createdOn;
}
