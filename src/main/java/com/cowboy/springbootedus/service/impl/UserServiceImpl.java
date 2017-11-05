package com.cowboy.springbootedus.service.impl;

import com.cowboy.springbootedus.dao.GoodsMapper;
import com.cowboy.springbootedus.dao.UserMapper;
import com.cowboy.springbootedus.domain.Goods;
import com.cowboy.springbootedus.domain.User;
import com.cowboy.springbootedus.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by cowboy on 2017-11-5.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public Page getUserLists(User user) {
        Page page = PageHelper.startPage(2,3);
        List<User> users = userMapper.getUserList(user);

        PageHelper.startPage(1,1);
        List<Goods> goods = goodsMapper.getGoods();

        return page;
    }
    @Transactional
    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
        userMapper.insertUser(user);
    }
}
