package com.cowboy.springbootedus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by cowboy on 2017-11-5.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String name;
    private String userName;
    private String password;
    private int age;
    private Date birthday;
}
