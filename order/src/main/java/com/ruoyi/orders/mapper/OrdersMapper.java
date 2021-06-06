package com.ruoyi.orders.mapper;

import java.util.List;
import com.ruoyi.orders.domain.Orders;

/**
 * 订单Mapper接口
 * 
 * @author ruoyi
 * @date 2021-06-06
 */
public interface OrdersMapper 
{
    /**
     * 查询订单
     * 
     * @param orderId 订单ID
     * @return 订单
     */
    public Orders selectOrdersById(String orderId);

    /**
     * 查询订单列表
     * 
     * @param orders 订单
     * @return 订单集合
     */
    public List<Orders> selectOrdersList(Orders orders);

    /**
     * 新增订单
     * 
     * @param orders 订单
     * @return 结果
     */
    public int insertOrders(Orders orders);

    /**
     * 修改订单
     * 
     * @param orders 订单
     * @return 结果
     */
    public int updateOrders(Orders orders);

    /**
     * 删除订单
     * 
     * @param orderId 订单ID
     * @return 结果
     */
    public int deleteOrdersById(String orderId);

    /**
     * 批量删除订单
     * 
     * @param orderIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrdersByIds(String[] orderIds);
}
