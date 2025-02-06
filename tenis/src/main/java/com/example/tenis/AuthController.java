package com.example.tenis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Se referă la login.html în templates/
    }

    @GetMapping("/")
    public String homePage() {
        return "home"; // Se referă la home.html în templates/
    }
}
