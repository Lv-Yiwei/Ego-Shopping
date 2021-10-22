package com.ego.service.dubbo.api;


import com.ego.commons.exception.provider.EgoProviderException;
import com.ego.pojo.ItemParam;

import java.util.List;

public interface ItemParamServiceDubboAPI {
    List<ItemParam> findItemParamsByPage(int page, int rows);

    long countItemParams();

    ItemParam findItemParamsByItemCatId(Long itemCatId);

    int addItemParam(ItemParam itemParam) throws EgoProviderException;

    int removeItemParamsByIds(Long[] ids) throws EgoProviderException;
}
