package com.xuan.controller;

import com.xuan.annotation.RequestLimit;
import com.xuan.pojo.User;
import com.xuan.service.UserService;
import com.xuan.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @className UserController
* @description TODO
* @author shuaichen
* @date 11:34 2023/3/26
* @version 1.0
* @since 1.0
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/detail")
    @RequestLimit(second = 30, maxCount = 3)
    public ResponseVo<User> getUserInfo(String userId){
        return ResponseVo.success(userService.getUserInfo(userId));
    }

}
