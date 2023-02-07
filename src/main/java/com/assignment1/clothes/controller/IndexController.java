package com.assignment1.clothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment1.clothes.service.ClotheService;

@Controller
@RequestMapping("/")
public class IndexController {

    private ClotheService clotheService;

    IndexController(ClotheService clotheService) {
        this.clotheService = clotheService;
    }

    @GetMapping
    @ModelAttribute
    public String getIndex(Model model) {
        model.addAttribute("clothes", clotheService.findAll());
        return "/index";
    }
}
