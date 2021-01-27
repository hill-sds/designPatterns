package com.example.design.common.dto;

/**
 * 通用返回值
 */
public class CommonResultDTO {

    // 1--成功  0--失败
    public int flag;

    //返回信息
    public String msg;

    public CommonResultDTO(int flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CommonResultDTO{" +
                "flag=" + flag +
                ", msg='" + msg + '\'' +
                '}';
    }
}
