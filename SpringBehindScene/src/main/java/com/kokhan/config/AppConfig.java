package com.kokhan.config;

import com.kokhan.Alien;
import com.kokhan.Computer;
import com.kokhan.Desktop;
import com.kokhan.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.kokhan")
public class AppConfig {
//    @Bean(name = "comp")

//    @Bean
//    public Alien alien(@Autowired Computer comp) {         //  @Qualifier("laptop")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setComp(comp);
//        return obj;
//    }
//
//    @Bean
//    //@Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
