package com.example.design.factorymethod.service.impl;

import com.example.design.factorymethod.service.TransportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 陆运
 */
@Slf4j
@Service
public class LandTransportServiceImpl implements TransportService {

    @Override
    public void doTransport(String uuid, String address) {
        log.info("陆运开始...............");
        log.info("将货物编号:" + uuid + ",运往:" + address);
        log.info("陆运结束...............");
    }
}
