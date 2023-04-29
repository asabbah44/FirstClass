package com.example.firstclass.Model;

import java.util.ArrayList;
import java.util.List;

public class DABook {

    ArrayList<Book> books =new ArrayList<>();

    public  DABook()
    {
        books.add(new Book( 1,300,"C# for beginners ", ".Net"));
        books.add(new Book( 2,600,"ASP.net ", ".Net"));
        books.add(new Book( 3,800,"MVC Core", ".Net"));

        books.add(new Book( 4,300,"Java level 1 ", "Java"));
        books.add(new Book( 5,600,"Java level 2 ", "Java"));
        books.add(new Book( 6,800,"Java advance", "Java"));
    }

    public List<Book> getBooksByCat(String cat)
    {
        List<Book> bookList =new ArrayList<>();

        for (Book i:books) {
           if(i.getCategory().equals(cat))
           {
               bookList.add(i);
           }
        }
        return bookList;

    }

    public String[] getcat()
    {
        String[] cat={".Net","Java"};
        return  cat;
    }
}
