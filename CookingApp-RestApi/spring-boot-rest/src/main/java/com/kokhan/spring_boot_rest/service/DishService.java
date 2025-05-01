package com.kokhan.spring_boot_rest.service;


import com.kokhan.spring_boot_rest.model.DishPost;
import com.kokhan.spring_boot_rest.repository.DishRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DishService {


    @Autowired
    private DishRepo repo;

    public void addDish(DishPost dishPost) {
        repo.save(dishPost);
    }

    public List<DishPost> getAllDish() {
        return repo.findAll();
    }

    public DishPost getDish(int recipeId) {
        return repo.findById(recipeId).orElse(new DishPost());
    }

    public void updateDish(DishPost dishPost) {
        repo.save(dishPost);
    }

    public void deleteDish(int recipeId) {
        repo.deleteById(recipeId);
    }

    public void load() {
        List<DishPost> dishes = new ArrayList<>(Arrays.asList(
                new DishPost(1, "Spaghetti Carbonara",
                        "A rich and creamy pasta dish made with eggs, cheese, pancetta, and pepper. Simple, satisfying, and full of flavor.",
                        25, List.of("Pasta", "Dinner")),

                new DishPost(2, "Minestrone Soup",
                        "A hearty Italian soup made with seasonal vegetables, beans, and pasta. Perfect for a comforting lunch.",
                        30, List.of("Soup", "Lunch", "Vegan")),

                new DishPost(3, "BBQ Grilled Salmon",
                        "Fresh salmon fillet marinated in herbs and grilled to perfection. Great for a summer BBQ or healthy dinner.",
                        20, List.of("Seafood", "Grill", "BBQ")),

                new DishPost(4, "Vegan Quinoa Salad",
                        "A protein-packed salad with quinoa, avocado, cucumber, cherry tomatoes, and a lemon vinaigrette.",
                        15, List.of("Salad", "Vegan", "Gluten-Free", "Lunch")),

                new DishPost(5, "Banana Oat Smoothie",
                        "A refreshing smoothie with bananas, oats, almond milk, and a touch of honey. Ideal for a quick breakfast or snack.",
                        5, List.of("Smoothie", "Breakfast", "Snack"))
        ));
        repo.saveAll(dishes);
    }

    public List<DishPost> search(String keyword) {
        return repo.findByDishNameContainingOrPostDescContaining(keyword, keyword);
    }
}
