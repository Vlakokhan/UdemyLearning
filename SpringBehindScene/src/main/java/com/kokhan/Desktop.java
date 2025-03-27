package com.kokhan;

public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop Object create");
    }

    @Override
    public void compile() {
        System.out.println("Compile desktop");
    }
}
