package com.example.SpringBootMySQL.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private int id;

    private String name;
    private int ISBN;
    private int yearPublished;
    private String authorName;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ISBN=" + ISBN +
                ", yearPublished=" + yearPublished +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
