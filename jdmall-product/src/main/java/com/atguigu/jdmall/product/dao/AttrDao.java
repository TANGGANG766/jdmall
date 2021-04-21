package com.atguigu.jdmall.product.dao;

import com.atguigu.jdmall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author tanggang
 * @email tanggangdan@gmail.com
 * @date 2021-01-26 18:55:03
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
