package com.ego.service.dubbo.api;

import com.ego.commons.pojo.EgoSearchItem;

import java.util.List;

//搜索商品 服务接口
public interface EgoSearchItemServiceDubboAPI {
    List<EgoSearchItem> findEgoSearchItemsByIds(List<Long> ids);
}
