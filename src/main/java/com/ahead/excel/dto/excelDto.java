package com.ahead.excel.dto;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/27 12:06
 */
public class excelDto<T> {
    private int code;
    private String msg;
    private int count;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public excelDto(int code, String msg, int count, T data){
        this.code=code;
        this.count=count;
        this.data=data;
        this.msg=msg;
    }
    public static <T>  excelDto<T> success(int code,String msg,int count,T data){
        return new  excelDto(0,"成功",count,data);
    }
}
