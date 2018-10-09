package com.darling.pubIn.service;

import com.darling.pubIn.bean.User;
import com.darling.pubIn.bean.UserAddress;

import java.util.List;

/**
 *   @author 董琳琳
 *   @date 2018/9/14 11:38
 *   @description   用户服务相关接口
 */
public interface UserService {

    /**
     * 获取用户地址信息
     * @param userId
     * @return
     */
    List<User> getUserAddressList(String userId);

    void sayHello();
}
