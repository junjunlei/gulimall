package com.jerry.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.gulimall.common.utils.PageUtils;
import com.jerry.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author jerry
 * @email leijunjun18@163.com
 * @date 2021-10-10 17:00:14
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

