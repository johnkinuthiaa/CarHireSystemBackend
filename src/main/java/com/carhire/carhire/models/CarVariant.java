package com.carhire.carhire.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class CarVariant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "car_id")
//    @JsonBackReference
//    private Car car;

    public CarVariant(){}
    public CarVariant(String variantName,
                      String variantDescription,
                      String company,
                      String modelNumber,
                      Integer year,
                      String fuelType,
                      Boolean hasAc,
                      Integer seatCapacity,
                      BigDecimal rentPerDay,
                      String imgUrl){
        this.variantName =variantName;
        this.variantDescription =variantDescription;
        this.company=company;
        this.modelNumber=modelNumber;
        this.year=year;
        this.fuelType=fuelType;
        this.hasAc=hasAc;
        this.seatCapacity=seatCapacity;
        this.rentPerDay=rentPerDay;
        this.imgUrl=imgUrl;

    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setVariantName(String variantName){
        this.variantName=variantName;
    }
    public String getVariantName(){
        return variantName;
    }
    public void setVariantDescription(String variantDescription){
        this.variantDescription =variantDescription;
    }
    public String getVariantDescription(){
        return variantDescription;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public String getCompany(){
        return company;
    }
    public void setModelNumber(String modelNumber){
        this.modelNumber=modelNumber;
    }
    public String getModelNumber(){
        return modelNumber;
    }
    public void setYear(Integer year){
        this.year =year;
    }
    public Integer getYear(){
        return year;
    }
    public void setFuelType(String fuelType){
        this.fuelType =fuelType;
    }
    public String getFuelType(){
        return fuelType;
    }
    public void setHasAc(Boolean hasAc){
        this.hasAc=hasAc;
    }
    public Boolean getHasAc(){
        return hasAc;
    }

    public void setSeatCapacity(Integer seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public Integer getSeatCapacity() {
        return seatCapacity;
    }

    public BigDecimal getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(BigDecimal rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public void setCreatedOn(LocalDateTime createdOn){
        this.createdOn=createdOn;
    }
    public LocalDateTime getCreatedOn(){
        return createdOn;
    }
}
