package com.example.SpringBootMySQL.Controllers;

import com.example.SpringBootMySQL.Models.Book;
import com.example.SpringBootMySQL.Services.MainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class MainController {

    private final MainService mainService;

    MainController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return mainService.getAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return mainService.createBook(book);
    }
}
