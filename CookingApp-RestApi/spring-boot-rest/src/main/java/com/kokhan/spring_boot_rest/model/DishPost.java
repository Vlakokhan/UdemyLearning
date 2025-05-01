package com.kokhan.spring_boot_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class DishPost {
    @Id
    private int recipeId;

    private String dishName;
    private String postDesc;
    private Integer cookingTime;

    private List<String> postDishType;
}
