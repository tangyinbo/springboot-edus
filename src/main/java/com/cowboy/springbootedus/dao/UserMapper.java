package com.cowboy.springbootedus.dao;

import com.cowboy.springbootedus.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * Created by cowboy on 2017-11-5.
 */
public interface UserMapper {
    @Select("select * from t_edu_user t order by t.user_id")
    public List<User> getUserList(User user);

    @Insert("insert into t_edu_user(name,user_name,password,age,birthday) values(#{name},#{userName},#{password},#{age},#{birthday})")
    @SelectKey(statement = "select last_insert_id()", keyProperty = "userId", before = false, resultType = int.class)
    public int insertUser(User user);
}
