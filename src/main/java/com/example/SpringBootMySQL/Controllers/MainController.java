package com.example.SpringBootMySQL.Controllers;

import com.example.SpringBootMySQL.Services.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final MainService mainService;

    MainController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/api/library")
    public String Get(){
        return mainService.greet();
    }
}
