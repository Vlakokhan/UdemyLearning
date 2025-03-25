package com.kokhan;

import jakarta.persistence.*;

import java.util.List;

// @Embeddable - using when we don't want create table for class but we want that data from object will have in Entity another class in another table
@Entity
@Cacheable
public class Laptop {

    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;


    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
