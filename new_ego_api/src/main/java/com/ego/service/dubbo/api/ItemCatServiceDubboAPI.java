package com.ego.service.dubbo.api;

import com.ego.pojo.ItemCat;

import java.util.Collection;
import java.util.List;

//商品类型相关操作的服务提供
public interface ItemCatServiceDubboAPI {
    //根据父节点查询子节点集合
    List<ItemCat> findItemCatsByParentId(Long parentId);

    List<ItemCat> findItemCatsByIds(Collection<Long> ids);
}
