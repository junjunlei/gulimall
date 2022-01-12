package com.jerry.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.gulimall.common.utils.PageUtils;
import com.jerry.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author jerry
 * @email leijunjun18@163.com
 * @date 2021-10-10 17:00:14
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

