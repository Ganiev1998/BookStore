package com.example.bookstore.Dao;

import com.example.bookstore.mapper.BookMapper;
import com.example.bookstore.mapper.UserMapper;
import com.example.bookstore.model.Book;
import com.example.bookstore.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public User valid(String password){
        return jdbcTemplate.queryForObject("select * from users where password = ?",new Object[]{password},new UserMapper());
    }
    public List<Book> selectAll(){
        return jdbcTemplate.query("select * from book",new BookMapper());
    }
    public Book selectById(Integer id){
        return jdbcTemplate.queryForObject("select * from book where id = ?"
                ,new Object[]{id},new BookMapper());
    }
    public boolean insert(Book book){
        jdbcTemplate.update("insert into book(name,author,publisher) values (?,?,?)",book.getName(),
                book.getAuthor(),book.getPublisher());
        return true;
    }
    public boolean update(Book book){
        jdbcTemplate.update("update book set name = ?,author = ?,publisher = ? where id = ?",
                book.getName(),book.getAuthor(),book.getPublisher(),book.getId());
        return true;
    }
    public boolean delete(Integer id){
        jdbcTemplate.update("delete from book where id = ?",id);
        return true;
    }
}
