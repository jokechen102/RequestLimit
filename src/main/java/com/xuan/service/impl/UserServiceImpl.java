package com.xuan.service.impl;

import com.xuan.pojo.User;
import com.xuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.xuan.constant.UserConstant.USER_REDIS_PRE;

/**
* @className UserServiceImpl
* @description TODO
* @author shuaichen
* @date 11:37 2023/3/26
* @version 1.0
* @since 1.0
*/
@Service
public class UserServiceImpl implements UserService {
    private static Map<String, User> userMap = new HashMap<>();
    static {
        userMap.put("1", new User("1", "张三", "130630", 1, "河北省"));
        userMap.put("2", new User("2", "李四", "430421", 1, "湖南省"));
        userMap.put("3", new User("3", "James", "dfaasfda", 2, "美国"));
    }
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public User getUserInfo(String userId) {
        redisTemplate.opsForValue().set(USER_REDIS_PRE+userId, 1, 300, TimeUnit.SECONDS);
        return userMap.get(userId);
    }
}
