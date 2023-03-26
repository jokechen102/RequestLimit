package com.xuan.service;


import com.xuan.pojo.User;

public interface UserService {
    /**
     * 根据 用户id 获取用户详情
     * @param userId
     * @return
     */
    User getUserInfo(String userId);

}
