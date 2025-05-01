package com.kokhan.CookingApp.service;

import com.kokhan.CookingApp.model.DishPost;
import com.kokhan.CookingApp.repository.DishRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    @Autowired
    private DishRepo repo;

    public void addDish(DishPost dishPost){
        repo.addDish(dishPost);
    }

    public List<DishPost> getAllDish(){
    return repo.getAllDish();
    }
}
