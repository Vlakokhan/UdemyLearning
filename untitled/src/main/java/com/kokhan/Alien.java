package com.kokhan;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    private String tech;

    @OneToMany(mappedBy = "alien")
    private List<Laptop> laptops;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
//@Table(name = "alien_table")
//@Column(name = "alien_name")
// @Transient //need for DB don't create this column. Maybe we want store some data or operations in object but no in DB
