package com.ego.service.dubbo.api;

import com.ego.commons.exception.provider.EgoProviderException;
import com.ego.pojo.Order;
import com.ego.pojo.OrderItem;
import com.ego.pojo.OrderShipping;

import java.util.List;

//订单服务接口
public interface OrderServiceDubboAPI {
    //创建订单
    int createOrder(Order order, List<OrderItem> orderItems, OrderShipping orderShipping) throws EgoProviderException;
}
