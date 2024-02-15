package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RedirectController {

    @GetMapping("/")
    public String redirectHome(Model model) {
        return "/books/home"; // Preusmjeri na početnu stranicu knjiga
    }
}
