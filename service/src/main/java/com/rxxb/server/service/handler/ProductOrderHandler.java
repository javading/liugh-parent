package com.rxxb.server.data.service.handler;

import com.rxxb.server.data.rds.entity.Order;
import com.rxxb.server.data.rds.enums.OrderAction;
import com.rxxb.server.data.rds.enums.OrderType;
import com.rxxb.server.data.rds.model.OrderModel;
import com.rxxb.server.data.service.processor.ActionProcessor;
import org.springframework.stereotype.Component;

/**
 * @author liugh
 * @since 2018-10-17
 */
@Component("ProductOrderHandler")
public class ProductOrderHandler extends OrderHandler {

	@Override
	public Order handleInternal(OrderAction action, OrderType orderType, OrderModel orderDef, Order currentOrder) throws Exception {
		return  ActionProcessor.process(action,orderType,orderDef,currentOrder);
	}
}
