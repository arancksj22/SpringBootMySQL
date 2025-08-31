package com.example.SpringBootMySQL.Repositories;

import com.example.SpringBootMySQL.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainRepo extends JpaRepository<Book, Integer> {
}
