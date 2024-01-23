package com.barbalho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbalho.model.Recipe;
import com.barbalho.model.User;
import com.barbalho.service.RecipeService;
import com.barbalho.service.UserService;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user/{userId}")
	public Recipe createRecipe(@RequestBody Recipe recipe, @PathVariable Long userId) throws Exception {
		
		User user = userService.findUserById(userId);
		
		Recipe createdRecipe = recipeService.createRecipe(recipe, user);
		return createdRecipe;
	}
	
	@GetMapping
	public List<Recipe> getAllRecipe() throws Exception {
			
		List<Recipe> recipes = recipeService.findAllRecipe();
		return recipes;
	}
	
	@DeleteMapping("/{recipeId}")
	public String deleteRecipe(@PathVariable Long recipeId) throws Exception {
			
		recipeService.deleteRecipe(recipeId);
		return "Recipe deleted successfully";
	}
	
	@PutMapping("/{id}")
	public Recipe updateRecipe(@RequestBody Recipe recipe, @PathVariable Long id) throws Exception {
		
		Recipe updateRecipe = recipeService.updateRecipe(recipe, id);
		return updateRecipe;
	}
	
	@PutMapping("/{id}/user/{userId}")
	public Recipe likeRecipe(@PathVariable Long userId, @PathVariable Long id) throws Exception {
		
		User user = userService.findUserById(userId);
		
		Recipe updateRecipe = recipeService.likeRecipe(id, user);
		return updateRecipe;
	}
	
}
