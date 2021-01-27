package com.example.design.factorymethod.controller;

import com.example.design.common.dto.CommonResultDTO;
import com.example.design.factorymethod.TransportFactory;
import com.example.design.factorymethod.dto.TransportDTO;
import com.example.design.factorymethod.service.TransportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TransportController {

    @Autowired
    private TransportFactory transportFactory;

    @PostMapping("doTransport")
    public CommonResultDTO executeTransport(@RequestBody TransportDTO transportDTO) {
        log.info("入参:" + transportDTO.toString());
        try {
            TransportService transportService = transportFactory.getTransportService(transportDTO.getType());
            transportService.doTransport(transportDTO.getUuid(), transportDTO.getAddress());
            return new CommonResultDTO(1, "成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new CommonResultDTO(0, e.getMessage());
        }
    }

}
