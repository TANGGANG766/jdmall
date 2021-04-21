package com.atguigu.jdmall.coupon.dao;

import com.atguigu.jdmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author tanggang
 * @email tanggangdan@gmail.com
 * @date 2021-01-26 22:38:31
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
