package com.ego.service.dubbo.api;

import com.ego.commons.exception.provider.EgoProviderException;
import com.ego.commons.exception.provider.Item.EgoProviderItemModifyStatusException;
import com.ego.pojo.Item;
import com.ego.pojo.ItemDesc;
import com.ego.pojo.ItemParamItem;

import java.util.Date;
import java.util.List;

//商品管理服务接口
public interface ItemServiceDubboAPI {
    //异常的传递和处理，事务管理需求,自定义异常，抛出异常代表方法执行错误，事务回滚
    //修改商品数据库中的状态
    //电商行业名词SKU，商品主键成为SKU
    //返回结果：通过返回结果数字提供修改结果状态 1-成功  ！1-失败
    //修改失败抛出的异常,代表数据库访问失败，事务回滚
    //传递更新时间，保证更新后的时间时Consumer的执行时间,因为远程调用有延迟
    int modifyItemsStatus(Long[] ids, Integer status, Date updated) throws EgoProviderItemModifyStatusException;

    //查询商品总计行数
    long countItems();

    //分页查询商品
    List<Item> findItemsByPage(int page, int rows);

    //新增商品到数据库
    int addItem(Item item, ItemDesc itemDesc, ItemParamItem itemParamItem) throws EgoProviderException;

    ItemDesc findItemDescByItemId(Long itemId);

    int modifyItem(Item item, ItemDesc itemDesc, ItemParamItem itemParamItem) throws EgoProviderException;

    Item findItemBySKU(Long itemId);

    List<Item> findItemByIds(Long[] ids);

    List<ItemDesc> findItemDescByIds(Long[] ids);
}
