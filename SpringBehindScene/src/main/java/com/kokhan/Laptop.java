package com.kokhan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop object created");
    }
    @Override
    public void compile() {
        System.out.println("Compile laptop");
    }
}
