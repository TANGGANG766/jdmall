package com.atguigu.jdmall.order.dao;

import com.atguigu.jdmall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author tanggang
 * @email tanggangdan@gmail.com
 * @date 2021-01-27 19:08:26
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
