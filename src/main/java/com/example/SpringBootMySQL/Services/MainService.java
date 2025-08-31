package com.example.SpringBootMySQL.Services;

import com.example.SpringBootMySQL.Models.Book;
import com.example.SpringBootMySQL.Repositories.MainRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    private final MainRepo repo;

    MainService(MainRepo repo){
        this.repo = repo;
    }

    public List<Book> getAllBooks(){
        return repo.findAll();
    }

    public Book createBook(Book book){
        return repo.save(book);
    }
}
