package com.atguigu.jdmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.jdmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author tanggang
 * @email tanggangdan@gmail.com
 * @date 2021-01-27 19:08:26
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

