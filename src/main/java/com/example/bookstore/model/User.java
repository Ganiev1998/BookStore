package com.example.bookstore.model;

public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer role_id;

    public User(Integer id, String userName, String password, Integer role_id) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role_id = role_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
}
