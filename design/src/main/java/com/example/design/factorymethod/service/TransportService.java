package com.example.design.factorymethod.service;

/**
 * 运输接口类
 */
public interface TransportService {

    /**
     * 执行运输
     * @param uuid
     * @param address
     */
    void doTransport(String uuid, String address);

}
