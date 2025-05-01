import React from 'react'
import DeleteIcon from '@mui/icons-material/Delete';
import EditIcon from '@mui/icons-material/Edit';
import SearchIcon from '@mui/icons-material/Edit';

import {
  Box,
    Card,
    Grid,
    InputAdornment,
    TextField,
    Typography,
  } from "@mui/material";
  import axios from "axios";
  import { useEffect, useState } from "react";
import { useNavigate } from 'react-router-dom';

const Search = () => {
    const [query, setQuery] = useState("");
    const [post, setPost] = useState(null);
    const navigate = useNavigate();

const handleEdit = (id) => {
  navigate("/edit",{state:{id}});
}

    useEffect(() => {
      const fetchPosts = async () => {
        const response = await axios.get(`http://localhost:8080/dishPosts/keyword/${query}`);    
        setPost(response.data);
      };
        const fetchInitialPosts = async () => {
            const response = await axios.get(`http://localhost:8080/dishPosts`);
            setPost(response.data);
        }
         fetchInitialPosts();
         if (query.length === 0) fetchInitialPosts();
         if (query.length > 2) fetchPosts();
      }, [query]);

      const handleDelete = (id) => {
        async function deletePost() {
          await axios.delete(`http://localhost:8080/dishPost/${id}`);
      }
      deletePost();
      window.location.reload();
      }

  return (
    <>
      <Grid container spacing={2} sx={{ margin: "2%" }}>
      <Grid item xs={12} sx={12} md={12} lg={12}>
      <Box>
          <TextField
            InputProps={{
              startAdornment: (
                <InputAdornment position="start">
                  <SearchIcon />
                </InputAdornment>
              ),
            }}
            placeholder="Search..."
            sx={{ width: "75%", padding: "2% auto" }}
            fullWidth
            onChange={(e) => setQuery(e.target.value)}
          />
        </Box>
      </Grid>
      {post &&
        post.map((p) => {
          return (
            <Grid key={p.id} item xs={12} md={6} lg={4}>
              <Card sx={{ padding: "3%", overflow: "hidden", width: "84%", backgroundColor:"#ADD8E6" }}>
                <Typography        
                  variant="h5"
                  sx={{ fontSize: "2rem", fontWeight: "600", fontFamily:"sans-serif" }}
                >
             {p.dishName}
                </Typography>
                <Typography  sx={{ color: "#585858", marginTop:"2%", fontFamily:"cursive" }} variant="body" >
                  Description: {p.postDesc}
                </Typography>
                <br />
                <br />
                <Typography variant="h6" sx={{ fontFamily:"unset", fontSize:"400"}}>
                Cooking Time: {p.cookingTime} minutes
                </Typography>
                <Typography sx={{fontFamily:"serif",fontSize:"400"}} gutterBottom  variant="body">Dish Type : </Typography>
                {p.postDishType.map((s, i) => {
                  return (
                    <Typography variant="body" gutterBottom key={i}>
                      {s} .
                      {` `}
                    </Typography>
                  );
                })}
               <DeleteIcon onClick={() => handleDelete(p.recipeId)} />
                <EditIcon onClick={() => handleEdit(p.recipeId)} />
              </Card>
            </Grid>
          );
        })}
    </Grid>
    </>
 
  )
}

export default Search