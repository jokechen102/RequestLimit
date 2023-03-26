package com.xuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
* @className User
* @description TODO
* @author shuaichen
* @date 11:35 2023/3/26
* @version 1.0
* @since 1.0
*/
@Data
@AllArgsConstructor
public class User {
    private String userId;
    private String name;
    private String certNo;
    private Integer certType;
    private String address;
}
