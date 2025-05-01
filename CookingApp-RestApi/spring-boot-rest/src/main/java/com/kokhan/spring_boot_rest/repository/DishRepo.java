package com.kokhan.spring_boot_rest.repository;


import com.kokhan.spring_boot_rest.model.DishPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepo extends JpaRepository<DishPost, Integer> {

    List<DishPost> findByDishNameContainingOrPostDescContaining(String dishName, String postDesc);
}

// Part without JpaRepository. And without Link DB.
//List<DishPost> dishes = new ArrayList<>(Arrays.asList(
//            new DishPost(1, "Spaghetti Carbonara",
//                    "A rich and creamy pasta dish made with eggs, cheese, pancetta, and pepper. Simple, satisfying, and full of flavor.",
//                    25, List.of("Pasta", "Dinner")),
//
//            new DishPost(2, "Minestrone Soup",
//                    "A hearty Italian soup made with seasonal vegetables, beans, and pasta. Perfect for a comforting lunch.",
//                    30, List.of("Soup", "Lunch", "Vegan")),
//
//            new DishPost(3, "BBQ Grilled Salmon",
//                    "Fresh salmon fillet marinated in herbs and grilled to perfection. Great for a summer BBQ or healthy dinner.",
//                    20, List.of("Seafood", "Grill", "BBQ")),
//
//            new DishPost(4, "Vegan Quinoa Salad",
//                    "A protein-packed salad with quinoa, avocado, cucumber, cherry tomatoes, and a lemon vinaigrette.",
//                    15, List.of("Salad", "Vegan", "Gluten-Free", "Lunch")),
//
//            new DishPost(5, "Banana Oat Smoothie",
//                    "A refreshing smoothie with bananas, oats, almond milk, and a touch of honey. Ideal for a quick breakfast or snack.",
//                    5, List.of("Smoothie", "Breakfast", "Snack"))
//    ));
//
//    public List<DishPost> getAllDish() {
//        return dishes;
//    }
//
//    public void addDish(DishPost dish) {
//        dishes.add(dish);
//        System.out.println(dishes);
//    }
//
//
//    public DishPost getDish(int recipeId) {
//        for (DishPost dish : dishes) {
//            if (dish.getRecipeId() == recipeId)
//                return dish;
//        }
//        return null;
//    }
//
//    public void updateDish(DishPost dishPost) {
//        for (DishPost dishPost1 : dishes)
//            if (dishPost1.getRecipeId() == dishPost.getRecipeId()) {
//                dishPost1.setDishName(dishPost.getDishName());
//                dishPost1.setPostDesc(dishPost.getPostDesc());
//                dishPost1.setCookingTime(dishPost.getCookingTime());
//                dishPost1.setPostDishType(dishPost.getPostDishType());
//            }
//    }
//
//    public void deleteDish(int recipeId) {
//        for (DishPost dishPost : dishes)
//            if (dishPost.getRecipeId() == recipeId)
//                dishes.remove(dishPost);
//    }