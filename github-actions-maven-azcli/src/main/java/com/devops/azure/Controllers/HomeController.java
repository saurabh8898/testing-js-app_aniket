package com.devops.azure.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "This is a war file from GitHub Actions with Maven and the AZ CLI!";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
