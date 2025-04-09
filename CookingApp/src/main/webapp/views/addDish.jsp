<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cooking Up Recipe Portal</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="../style.css">
    <link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#">Cooking Up Recipe Portal</a>
        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="viewalldish">All Recipes</a></li>
                <li class="nav-item"><a class="nav-link" href="www.linkedin.com/in/vladyslavkokhan">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h2 class="mb-3 text-center fs-3 font-weight-bold">Add a New Recipe</h2>
                    <form action="handleForm" method="post">
                        <div class="mb-1">
                            <label for="recipeId" class="form-label">Recipe ID</label>
                            <input type="text" class="form-control" id="recipeId"
                                   name="recipeId" required>
                        </div>

                        <div class="mb-1">
                            <label for="dishName" class="form-label">Dish Name</label>
                            <input type="text" class="form-control" id="dishName" name="dishName" required>
                        </div>
                        <div class="mb-1">
                            <label for="postDesc" class="form-label">Description & Ingredients</label>
                            <textarea class="form-control" id="postDesc" name="postDesc" rows="3" required></textarea>
                        </div>

                        <div class="mb-1">
                            <label for="cookingTime" class="form-label">Cooking Time (minutes)</label>
                            <input type="number" class="form-control" id="cookingTime" name="cookingTime" required>
                        </div>

                        <div class="mb-2">
                            <label for="postDishType" class="form-label">Dish Type</label>
                            <select multiple class="form-select" id="postDishType" name="postDishType" required>
                                <option value="Soup">Soup</option>
                                <option value="Salad">Salad</option>
                                <option value="Pizza">Pizza</option>
                                <option value="Pasta">Pasta</option>
                                <option value="Dessert">Dessert</option>
                                <option value="Stew">Stew</option>
                                <option value="Curry">Curry</option>
                                <option value="Grill">Grill</option>
                                <option value="Sandwich">Sandwich</option>
                                <option value="Baked">Baked</option>
                                <option value="Vegan">Vegan</option>
                                <option value="Gluten-Free">Gluten-Free</option>
                                <option value="Breakfast">Breakfast</option>
                                <option value="Lunch">Lunch</option>
                                <option value="Dinner">Dinner</option>
                                <option value="Snack">Snack</option>
                                <option value="Smoothie">Smoothie</option>
                                <option value="Rice Dish">Rice Dish</option>
                                <option value="Seafood">Seafood</option>
                                <option value="BBQ">BBQ</option>
                                <option value="Appetizer">Appetizer</option>
                                <option value="Main Course">Main Course</option>
                                <option value="Side Dish">Side Dish</option>
                                <option value="Street Food">Street Food</option>
                                <option value="Slow Cooked">Slow Cooked</option>
                                <option value="Air Fryer">Air Fryer</option>
                                <option value="Low Carb">Low Carb</option>
                                <option value="High Protein">High Protein</option>
                                <option value="Comfort Food">Comfort Food</option>
                                <option value="Holiday Special">Holiday Special</option>
                                <option value="Quick & Easy">Quick & Easy</option>
                                <option value="One Pot">One Pot</option>
                            </select>

                        </div>

                        <button type="submit" class="btn btn-primary">Submit Recipe</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
