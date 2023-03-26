package com.xuan.vo;

import com.xuan.enmus.ApiResultEnum;
import lombok.Data;

import java.io.Serializable;

/**
* @className ResponseVo
* @description TODO
* @author shuaichen
* @date 12:18 2023/3/26
* @version 1.0
* @since 1.0
*/
@Data
public class ResponseVo<T> implements Serializable {
    public ResponseVo(){}
    public ResponseVo(ApiResultEnum resultEnum){
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = null;
    }

    /**
     * 响应状态码，0-成功，非0-失败
     */
    private Integer code = 0;

    /**
     * 返回结果说明
     */
    private String msg = "成功";

    /**
     * JSON格式响应数据
     */
    private T data;

    /**
     * 返回成功
     * @param data
     * @return
     */
    public static ResponseVo success(Object data){
        ResponseVo response = new ResponseVo();
        response.setCode(0);
        response.setMsg("成功");
        response.setData(data);
        return response;
    }

    public static ResponseVo error(ApiResultEnum errorEnum){
        ResponseVo response = new ResponseVo(errorEnum);
        return response;
    }
}
