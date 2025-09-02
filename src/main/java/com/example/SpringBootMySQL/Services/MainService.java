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

    public void deleteBook(int id){
        repo.deleteById(id);
    }

    public Book updateBook(int id, Book updatedBook){
        Book existing = repo.findById(id)
                            .orElseThrow(() -> new RuntimeException("Book not found"));

        existing.setId(updatedBook.getId());
        existing.setISBN(updatedBook.getISBN());
        existing.setName(updatedBook.getName());
        existing.setAuthorName(updatedBook.getAuthorName());
        existing.setYearPublished(updatedBook.getYearPublished());

        return repo.save(existing);
    }

    public Book getBookById(int id){
        return repo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Book not found"));
    }
}
