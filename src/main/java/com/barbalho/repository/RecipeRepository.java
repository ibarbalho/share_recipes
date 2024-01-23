package com.barbalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbalho.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
