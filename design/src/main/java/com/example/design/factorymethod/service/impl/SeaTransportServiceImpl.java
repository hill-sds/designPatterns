package com.example.design.factorymethod.service.impl;

import com.example.design.factorymethod.service.TransportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 海运
 */

@Slf4j
@Service
public class SeaTransportServiceImpl implements TransportService {

    @Override
    public void doTransport(String uuid, String address) {
        log.info("海运开始...............");
        log.info("将货物编号:" + uuid + ",运往:" + address);
        log.info("海运结束...............");
    }

}
