package com.example.design.factorymethod.dto;

import lombok.Data;

@Data
public class TransportDTO {

    //运输类型 1-空运 2-陆运 3-水运
    public int type;

    //运输地址
    public String address;

    //运输物品编号
    public String uuid;

}
