package com.example.bookstore.mapper;

import com.example.bookstore.model.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Book(rs.getInt(1),rs.getString(2),
                rs.getString(3),rs.getString(4));
    }
}
