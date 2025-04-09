<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recipe List</title>

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
            crossorigin="anonymous">

    <style>
        .card {
            border: 2px solid #343a40;
            background-color: #f8f9fa;
            margin-bottom: 20px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="style.css">
    <link rel="stylesheet" type="text/css" href="style1.css"></head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#">CookingUp Recipe Portal</a>
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
    <h2 class="mb-4 text-center font-weight-bold">Recipe List</h2>

    <div class="row row-cols-1 row-cols-md-2 g-4 justify-content-center">
        <c:forEach var="postDishes" items="${postDishes}">
            <div class="col">
                <div class="card border-dark bg-dark text-white">
                    <div class="card-body">
                        <h5 class="card-title">${postDishes.dishName}</h5>
                        <p class="card-text">
                            <strong>Description & Ingredients:</strong>
                                ${postDishes.postDesc}
                        </p>
                        <p class="card-text">
                            <strong>Cooking Time:</strong>
                                ${postDishes.cookingTime} minutes
                        </p>
                        <p class="card-text">
                            <strong>Dish Type(s):</strong>
                        <ul>
                            <c:forEach var="dish" items="${postDishes.postDishType}">
                                <li>${dish}</li>
                            </c:forEach>
                        </ul>
                        </p>
                    </div>
                    <div class="card-footer">
                        <!-- Optional footer content -->
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
