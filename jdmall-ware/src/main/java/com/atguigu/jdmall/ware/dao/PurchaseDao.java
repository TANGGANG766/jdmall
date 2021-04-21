package com.atguigu.jdmall.ware.dao;

import com.atguigu.jdmall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author tanggang
 * @email tanggangdan@gmail.com
 * @date 2021-01-27 20:15:22
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
