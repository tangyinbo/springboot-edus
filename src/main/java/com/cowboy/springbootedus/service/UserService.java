package com.cowboy.springbootedus.service;

import com.cowboy.springbootedus.domain.User;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by cowboy on 2017-11-5.
 */
public interface UserService {
    public Page getUserLists(User user);

    void insertUser(User user);
}
