package com.jerry.gulimall.order.dao;

import com.jerry.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jerry
 * @email leijunjun18@163.com
 * @date 2021-10-10 17:00:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
