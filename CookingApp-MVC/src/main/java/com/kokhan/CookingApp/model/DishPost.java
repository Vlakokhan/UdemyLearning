package com.kokhan.CookingApp.model;

import lombok.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class DishPost {
    private int recipeId;
    private String dishName;
    private String postDesc;
    private Integer cookingTime;
    private List<String> postDishType;
}
