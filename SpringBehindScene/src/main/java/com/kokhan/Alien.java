package com.kokhan;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Computer comp;

    public Alien(){
        System.out.println("Alien Object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code() {
        System.out.println("Codding");
        comp.compile();
    }


}

