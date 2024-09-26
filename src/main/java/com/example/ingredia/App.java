package com.example.ingredia; // Ensure this matches your directory structure

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    // Example endpoint to handle recipe generation
    @PostMapping("/generate-recipe")
    public String generateRecipe(@RequestBody RecipeRequest request) {
        // Here, you'll add your logic to call the GPT API and generate a recipe
        String ingredients = request.getIngredients();
        int calorieCount = request.getCalorieCount();
        
        // TODO: Integrate with GPT API to get the recipe based on ingredients and calorie count
        
        // Placeholder response
        return "Generated recipe for ingredients: " + ingredients + " with calorie count: " + calorieCount;
    }
}

// Class to model the request body
class RecipeRequest {
    private String ingredients;
    private int calorieCount;

    // Getters and setters
    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getCalorieCount() {
        return calorieCount;
    }

    public void setCalorieCount(int calorieCount) {
        this.calorieCount = calorieCount;
    }
}
