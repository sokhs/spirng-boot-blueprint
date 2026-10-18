package com.project.spring.boot.blueprint;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    private Integer id;

    private String name;

    private Integer age = 0;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
