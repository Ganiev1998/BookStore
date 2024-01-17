package com.example.bookstore.service;

import com.example.bookstore.Dao.BookDao;
import com.example.bookstore.model.Book;
import com.example.bookstore.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService_admin {
    @Autowired
    BookDao bookDao;
    public User valid(String password){
        return bookDao.valid(password);
    }
    public List<Book> selectAll(){
        return bookDao.selectAll();
    }
    public Book selectById(Integer id){
        return bookDao.selectById(id);
    }
    public boolean insert(Book book){
        bookDao.insert(book);
        return true;
    }
    public boolean update(Book book){
        bookDao.update(book);
        return true;
    }
    public boolean delete(Integer id){
        bookDao.delete(id);
        return true;
    }
}
