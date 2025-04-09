package com.kokhan.CookingApp;

import com.kokhan.CookingApp.model.DishPost;
import com.kokhan.CookingApp.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DishController {

    @Autowired
    private DishService service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("addrecipe")
    public String addRecipe(){
        return "addDish";
    }

    @PostMapping("handleForm")
    public String handleForm( DishPost dishPost){
        service.addDish(dishPost);
        return  "success";
    }

    @GetMapping("viewalldish")
    public String viewDish(Model model){
        List<DishPost> dishes = service.getAllDish();
        model.addAttribute("postDishes", dishes);
        return "viewalldish";
    }

}
