package com.kokhan.spring_boot_rest;

import com.kokhan.spring_boot_rest.model.DishPost;
import com.kokhan.spring_boot_rest.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class DishRestController {


    @Autowired
    private DishService service;

    @GetMapping("dishPosts")
    public List<DishPost> getAllDish() {
        return service.getAllDish();
    }

    @GetMapping("dishPost/{recipeId}")
    public DishPost getDish(@PathVariable int recipeId) {
        return service.getDish(recipeId);
    }

    @GetMapping("dishPosts/keyword/{keyword}")
    public List<DishPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return service.search(keyword);
    }

    @PostMapping("dishPost")
    public DishPost addDish(@RequestBody DishPost dishPost) {
        service.addDish(dishPost);
        return service.getDish(dishPost.getRecipeId());
    }

    @PutMapping("dishPost")
    public DishPost updateDish(@RequestBody DishPost dishPost) {
        service.updateDish(dishPost);
        return service.getDish(dishPost.getRecipeId());
    }

    @DeleteMapping("dishPost/{recipeId}")
    public String deleteDish(@PathVariable int recipeId) {
        service.deleteDish(recipeId);
        return "Deleted Dish";
    }

    @GetMapping("load")
    public String loadData() {
        service.load();
        return "Data load";
    }

}
