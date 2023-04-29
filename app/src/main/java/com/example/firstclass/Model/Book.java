package com.example.firstclass.Model;


public class Book {
    private  int id;
    private int pages;
    private String title;
    private  String category;

    public Book(int id, int pages, String title, String category) {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
