package com.example.design.factorymethod;

import com.example.design.factorymethod.service.TransportService;
import com.example.design.factorymethod.service.impl.AirTransportServiceImpl;
import com.example.design.factorymethod.service.impl.LandTransportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class TransportFactory {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 返回实现类
     * @param type
     * @return
     */
    public TransportService getTransportService(int type) {
        if(1 == type) return applicationContext.getBean(AirTransportServiceImpl.class);
        if(2 == type) return applicationContext.getBean(LandTransportServiceImpl.class);
        if(3 == type) return applicationContext.getBean(LandTransportServiceImpl.class);
        throw new RuntimeException("未获取到正确的运输方式");
    }

}
