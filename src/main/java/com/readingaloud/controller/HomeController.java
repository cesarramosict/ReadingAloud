package com.readingaloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles the home page of ReadingAloud.
 *
 * @author Julio Ramos do Carmo
 */
@Controller
public class HomeController {

    /**
     * Shows the home page.
     *
     * @param model data sent to the template
     * @return the name of the template to render (templates/home.html)
     */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "ReadingAloud");
        return "home";
    }
}