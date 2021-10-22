package com.ego.service.dubbo.api;

import com.ego.pojo.Manager;
//定义Manager管理员服务接口
//Provider实现consumer调用

public interface ManagerServiceDubboAPI {
    //商业项目中，方法名称定义有常规习惯
    //Mapper:
    //  insertxxx
    //  updatexxx
    //  deletexxx
    //  selectxxx
    //Service:
    //  addxxx createxxx
    //  modifyxxx setxxx
    //  dropxxx removexxx
    //  getxxx findxxx
    Manager findManagerByUsername(String username);
}
