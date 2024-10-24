package com.carhire.carhire.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String variantImg;
    private String name;
    private String bookingId;
    private Integer totalDays;
    private BigDecimal price;
    private String Customer;
    private LocalDateTime bookingTime;
    private LocalDateTime bookFrom;
    private LocalDateTime bookTo;
    private String status;
    private String vehicleReg;
    private String paymentStatus;
}
