package com.rxxb.server.data.service.impl;

import com.rxxb.server.data.rds.entity.Order;
import com.rxxb.server.data.rds.enums.OrderAction;
import com.rxxb.server.data.rds.enums.OrderType;
import com.rxxb.server.data.rds.mapper.OrderMapper;
import com.rxxb.server.data.rds.model.OrderModel;
import com.rxxb.server.data.service.handler.OrderHandler;
import com.rxxb.server.data.service.IOrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单主表，当前表只保存流转中的订单信息 服务实现类
 * </p>
 *
 * @author liugh
 * @since 2018-10-17
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {


    @Override
    public Order handleOrder(OrderAction action, OrderType orderType, OrderModel orderDef) throws Exception {
        Order order = OrderHandler.handle(action, orderType, orderDef);
        return order;
    }

}
