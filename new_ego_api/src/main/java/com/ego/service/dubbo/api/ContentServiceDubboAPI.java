package com.ego.service.dubbo.api;

import com.ego.commons.exception.provider.EgoProviderException;
import com.ego.pojo.Content;

import java.util.List;

//内容服务接口
public interface ContentServiceDubboAPI {
    /*
    根据商品主键分类查询内容
    */
    List<Content> findContentByContentCategoryId(Long categoryId, int page, int rows);

    //根据内容分类主键，统计内容数据行数
    long countContentByCategoryId(Long categoryId);

    int addContent(Content content) throws EgoProviderException;

    int removeContentsByIds(Long[] ids) throws EgoProviderException;

    int modifyContent(Content content) throws EgoProviderException;

    Content findContentById(Long id);
}
