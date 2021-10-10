package com.jerry.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.gulimall.com.jerry.gulimall.common.utils.PageUtils;
import com.jerry.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author jerry
 * @email leijunjun18@163.com
 * @date 2021-10-10 17:05:11
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

