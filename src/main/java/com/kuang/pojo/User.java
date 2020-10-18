package com.kuang.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    private String name;
    private int age;

    private String happy;

    public User(String name, int age, String happy) {
        this.name = name;
        this.age = age;
        this.happy = happy;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
