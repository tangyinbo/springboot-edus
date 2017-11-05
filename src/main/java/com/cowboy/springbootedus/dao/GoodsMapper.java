package com.cowboy.springbootedus.dao;

import com.cowboy.springbootedus.domain.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by cowboy on 2017-11-5.
 */
public interface GoodsMapper {
    @Select("select * from t_goods t order by id")
    public List<Goods> getGoods();
}
