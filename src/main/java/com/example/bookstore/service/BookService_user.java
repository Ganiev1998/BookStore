package com.example.bookstore.service;

import com.example.bookstore.Dao.BookDao;
import com.example.bookstore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService_user {
    @Autowired
    BookDao bookDao;
    public List<Book> selectAll(){
        return bookDao.selectAll();
    }
    public Book selectById(Integer id){
        return bookDao.selectById(id);
    }
}
