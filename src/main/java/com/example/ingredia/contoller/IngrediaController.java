package com.example.ingredia.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IngrediaController {

    @PostMapping("/submit")
    public String handleForm(@RequestParam("ingredient") String ingredient,
                             @RequestParam("calories") int calories) {
        // Process the form data (ingredient and calories)
        System.out.println("Ingredient: " + ingredient + ", Calories: " + calories);
        return "redirect:/src/main/resources/static/from.html";  // Redirect back to the form page or another page
    }
}
