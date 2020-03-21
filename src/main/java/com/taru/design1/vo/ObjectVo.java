package com.taru.design1.vo;

public class ObjectVo {
    public Integer status;    //0为OK，1为失败
    public String message;
    public Object data;

    public ObjectVo(Integer status){
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
