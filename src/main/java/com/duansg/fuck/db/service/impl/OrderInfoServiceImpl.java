package com.duansg.fuck.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duansg.fuck.db.dao.OrderInfoMapper;
import com.duansg.fuck.db.entity.OrderInfo;
import com.duansg.fuck.db.service.OrderInfoService;
import org.springframework.stereotype.Service;

/**
 * OrderInfoServiceImpl
 *
 * @author Duansg
 * @version 1.0
 * @date 2020/12/10 下午10:20
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
