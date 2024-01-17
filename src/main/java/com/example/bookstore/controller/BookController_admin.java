package com.example.bookstore.controller;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.User;
import com.example.bookstore.service.BookService_admin;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class BookController_admin {
    @Autowired
    BookService_admin bookService;
    @GetMapping("/login_admin")
    public ModelAndView validation(@RequestParam("userName")String name,
                                   @RequestParam("password")String password,
                                   @RequestParam("role_id")String role_id){
        User user = bookService.valid(password);
        if (!(user ==null)){
            ModelAndView mv = new ModelAndView("index");
            return mv;
        }
        return new ModelAndView("index");
    }
    @GetMapping("/")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("/admin/admin");
        //request.getSession().setAttribute("user",new User(1,"user","1234",1));
        return mv;
    }
    @GetMapping("/login")
    public String not_found(){
        return "please sign up";
    }


    @GetMapping
    public List<Book> select(){
        return bookService.selectAll();
    }
    @GetMapping("/{id}")
    public Book selectById(@PathVariable("id")Integer id){
        return bookService.selectById(id);
    }
    @PostMapping
    public String insert(@RequestBody Book book){
        bookService.insert(book);
        return "book is created";
    }
    @PutMapping
    public String update(@RequestBody
                             Book book){
        bookService.update(book);
        return "book is updated";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id")Integer id){
        bookService.delete(id);
        return "book is deleted";
    }
}
