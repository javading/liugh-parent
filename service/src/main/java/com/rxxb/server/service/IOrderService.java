package com.rxxb.server.data.service;

import com.rxxb.server.data.rds.entity.Order;
import com.rxxb.server.data.rds.enums.OrderAction;
import com.rxxb.server.data.rds.enums.OrderType;
import com.rxxb.server.data.rds.model.OrderModel;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 订单主表，当前表只保存流转中的订单信息 服务类
 * </p>
 *
 * @author liugh123
 * @since 2018-10-17
 */
public interface IOrderService extends IService<Order> {

    Order handleOrder(OrderAction action, OrderType orderType, OrderModel orderDef) throws Exception;

}
