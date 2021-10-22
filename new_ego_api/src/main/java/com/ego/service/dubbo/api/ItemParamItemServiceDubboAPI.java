package com.ego.service.dubbo.api;

import com.ego.pojo.ItemParamItem;

import java.util.List;

//商品规格数据服务接口
public interface ItemParamItemServiceDubboAPI {
    ItemParamItem findItemParamItemByItemId(Long itemId);

    List<ItemParamItem> findItemParamItemsByItemIds(Long[] ids);
}
