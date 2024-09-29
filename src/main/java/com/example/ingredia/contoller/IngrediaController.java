package com.example.ingredia.contoller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IngrediaController {

    @GetMapping("/form")
    public String showForm() {
        return "from";  // Make sure to return the name of the HTML file without .html
    }

    @PostMapping("/submit")
    public String handleForm(@RequestParam("ingredient") String ingredient,
                             @RequestParam("calories") int calories) {
        // Process the form data (ingredient and calories)
        System.out.println("Ingredient: " + ingredient + ", Calories: " + calories);
        return "redirect:/form";  // Redirect back to the form page or another page
    }
}