package com.example.SpringBootMySQL.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api")
    public String Get(){
        return "tested";
    }
}
