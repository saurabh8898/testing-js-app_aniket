package com.devops.azure.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Hello, world! From a war file built with Gradle and deployed with Azure DevOps";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
