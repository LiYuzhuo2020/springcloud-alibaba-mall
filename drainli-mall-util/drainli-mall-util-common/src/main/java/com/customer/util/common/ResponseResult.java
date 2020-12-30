package com.customer.util.common;

import java.io.Serializable;

/**
 * @Author: Drainli
 * @Date: 2020/11/5 14:21
 * @Description: 响应结果集
 * @Version: 1.0
 **/
public class ResponseResult<T> implements Serializable {

    /**
     *  响应数据集
     */
    private T data ;

    /**
     *  响应消息
     */
    private String message ;

    /**
     *  状态码
     *  20000 响应成功
     *  50000 响应失败
     *  50001 系统错误
     */
    private Integer code ;

    public ResponseResult() {

    }

    public ResponseResult(ResponseCode responseCode ) {
        this.code = responseCode.getCode() ;
        this.message = responseCode.getMessage() ;
    }

    public ResponseResult(T data , ResponseCode responseCode) {
        this.data = data ;
        this.code = responseCode.getCode() ;
        this.message = responseCode.getMessage() ;
    }

    public static ResponseResult ok() {
        return new ResponseResult(null, ResponseCode.SUCCESS);
    }

    public static ResponseResult ok(Object data) {
        return new ResponseResult(data, ResponseCode.SUCCESS);
    }

    public static ResponseResult error() {
        return new ResponseResult(null, ResponseCode.ERROR);
    }

    public static ResponseResult error(String message) {
        return secByError(ResponseCode.ERROR.getCode(),message);
    }

    //自定义异常
    public static ResponseResult secByError(Integer code,String message) {
        ResponseResult err = new ResponseResult();
        err.setCode(code);
        err.setMessage(message);
        return err;
    }

    public static ResponseResult error(ResponseCode resultCode) {
        return new ResponseResult(resultCode);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
