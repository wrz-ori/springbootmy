package com.springbootm.entity;

import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2019/12/2.
 */
@Component
public class User {
    private  String name;
    private Integer id;

    public User() {
    }

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
