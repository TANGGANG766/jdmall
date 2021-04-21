package com.atguigu.jdmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.jdmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author tanggang
 * @email tanggangdan@gmail.com
 * @date 2021-01-26 18:55:03
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

