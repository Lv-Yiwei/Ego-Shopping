package com.ego.service.dubbo.api;

import com.ego.commons.exception.provider.EgoProviderException;
import com.ego.pojo.User;

//处理前台系统相关服务逻辑
/*
 * 方案一：定义一个服务方法，参数是String checkData和 int checkType。服务实现判断checkType，动态完成数据查询;
 *          开发简便
 * 方案二：定义三个服务方法，分别实现用户名，手机号，邮箱查询;
 * */
public interface UserServiceDubboAPI {
    //根据条件查询用户
    //查询无数据返回null，有数据返回用户对象
    User findUserInfo(String checkData, int checkType);

    int addUser(User user) throws EgoProviderException;

    User findUserByPrincipal(String username, String password);
}
