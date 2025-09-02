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

    public String backEndEntered(){
        return "This is the backend, Welcome";
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return mainService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id){
        return mainService.getBookById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return mainService.createBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return mainService.updateBook(id, book);
    }


    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id){
        mainService.deleteBook(id);
    }
}
