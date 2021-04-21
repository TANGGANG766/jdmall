package com.atguigu.jdmall.order.dao;

import com.atguigu.jdmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tanggang
 * @email tanggangdan@gmail.com
 * @date 2021-01-27 19:08:26
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
