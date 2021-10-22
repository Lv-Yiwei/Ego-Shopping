package com.ego.service.dubbo.api;

import com.ego.commons.exception.provider.EgoProviderException;
import com.ego.pojo.ContentCategory;

import java.util.Date;
import java.util.List;

//那日容分类服务接口
public interface ContentCategoryServiceDubboAPI {
    List<ContentCategory> findContentCategoryListByParentId(Long parentId);

    int addContentCategory(ContentCategory contentCategory) throws EgoProviderException;

    ContentCategory findContentCategoryById(Long id);

    int modifyContentCategory(ContentCategory contentCategory) throws EgoProviderException;

    int removeContentCategoryById(Long id, Date now) throws EgoProviderException;
}
