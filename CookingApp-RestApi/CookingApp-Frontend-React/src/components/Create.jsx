import React, { useState } from "react";
import axios from "axios";
import {
  Typography,
  TextField,
  Button,
  Paper,
  Box,
} from "@mui/material";
import { useNavigate } from "react-router-dom";
const initial = { recipeId:"",dishName: "", cookingTime: 0, postDishType: [], postDesc:"" };


const Create = () => {
  const dishType = [
    { name: "Soup" },
  { name: "Salad" },
  { name: "Pizza" },
  { name: "Pasta" },
  { name: "Dessert" },
  { name: "Stew" },
  { name: "Curry" },
  { name: "Grill" },
  { name: "Sandwich" },
  { name: "Baked" },
  { name: "Vegan" },
  { name: "Gluten-Free" },
  { name: "Breakfast" },
  { name: "Lunch" },
  { name: "Dinner" },
  { name: "Snack" },
  { name: "Smoothie" },
  { name: "Rice Dish" },
  { name: "Seafood" },
  { name: "BBQ" },
  { name: "Appetizer" },
  { name: "Main Course" },
  { name: "Side Dish" },
  { name: "Street Food" },
  { name: "Slow Cooked" },
  { name: "Air Fryer" },
  { name: "Low Carb" },
  { name: "High Protein" },
  { name: "Comfort Food" },
  { name: "Holiday Special" },
  { name: "Quick & Easy" },
  { name: "One Pot" }
];

  const navigate = useNavigate();
  const [form, setForm] = useState(initial);

  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .post("http://localhost:8080/dishPost",form)
      .then((resp) => {
        console.log(resp.data);
      })
      .catch((error) => {
        console.log(error);
      });
      navigate('/');
    };


  const { recipeId, dishName, cookingTime, postDesc } = form;

  const handleChange = (e) => {
    setForm({...form , postDishType : [...form.postDishType, e.target.value]});
  }

  

  return (
    <Paper sx={{ padding:"1%"}} elevation={0}>
      <Typography sx={{ margin: "3% auto" }} align="center" variant="h5">
        Create New Post
      </Typography>
      <form autoComplete="off" noValidate onSubmit={handleSubmit}>
        <Box
          sx={{
            display: "flex",
            justifyContent: "center",
            flexDirection: "column",
          }}
        >
           <TextField
            min="0"
            type="number"
            sx={{ width: "50%", margin: "2% auto" }}
            
            onChange={(e) => setForm({ ...form, recipeId: e.target.value })}
            label="Enter your Dish ID"
            variant="outlined"
            value={recipeId}
          />
          <TextField
            type="string"
            sx={{ width: "50%", margin: "2% auto" }}
            required
            onChange={(e) => setForm({ ...form, dishName: e.target.value })}
            label="Dish-Profile"
            variant="outlined"
            value={dishName}
          />
          <TextField
            min="0"
            type="number"
            sx={{ width: "50%", margin: "2% auto" }}
            required
            onChange={(e) => setForm({ ...form, cookingTime: e.target.value })}
            label="Minutes of cooking"
            variant="outlined"
            value={cookingTime}
          />
           <TextField
            type="string"
            sx={{ width: "50%", margin: "2% auto" }}
            required
            multiline
            rows={4}
            onChange={(e) => setForm({ ...form, postDesc: e.target.value })}
            label="Job-desc"
            variant="outlined"
            value={postDesc}
          />
          <Box sx={{ margin:"1% auto"}}>
          <h3>Please mention required dish type</h3>
         <ul>
        {dishType.map(({ name }, index) => {
          return (
            <li key={index}>
              <div >
                <div>
                  <input
                    type="checkbox"
                    id={`custom-checkbox-${index}`}
                    name={name}
                    value={name}
                    onChange={handleChange}  
                  />
                  <label htmlFor={`custom-checkbox-${index}`}>{name}</label>
                </div>
              </div>
            </li>
          );
        })}
       
      </ul>
          </Box>
          <Button
            sx={{ width: "50%", margin: "2% auto" }}
            variant="contained"
            type="submit"
          >
            Submit
          </Button>
        </Box>
      </form>
    </Paper>
  );
}

export default Create