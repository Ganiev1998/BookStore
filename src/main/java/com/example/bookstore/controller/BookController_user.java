package com.example.bookstore.controller;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.User;
import com.example.bookstore.service.BookService_admin;
import com.example.bookstore.service.BookService_user;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class BookController_user {
    @Autowired
    BookService_user bookService;
    @PostMapping("/login_user")
    public User login(HttpServletRequest request, @RequestBody User user){
        request.getSession().setAttribute("user",new User(user.getId(),user.getUserName(),
                user.getPassword(),user.getRole_id()));
        request.getSession().setMaxInactiveInterval(60);
        return user;
    }
    @GetMapping("/login")
    public String not_found(){
        return "please sign up";
    }
    @GetMapping
    public List<Book> selectAll(){
        return bookService.selectAll();
    }
    @GetMapping("/{id}")
    public Book selectById(@PathVariable("id")Integer id){
        return bookService.selectById(id);
    }
}
