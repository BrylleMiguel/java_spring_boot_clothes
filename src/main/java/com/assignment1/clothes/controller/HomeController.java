package com.assignment1.clothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment1.clothes.service.ClotheService;

@Controller
@RequestMapping("/home")
public class HomeController {

    private ClotheService clotheService;

    HomeController(ClotheService clotheService) {
        this.clotheService = clotheService;
    }

    @GetMapping
    @ModelAttribute
    public String getIndex(Model model) {
        model.addAttribute("clothes", clotheService.findAll());
        model.addAttribute("brands", clotheService.getBrands());

        return "home";
    }
}
