package org.supercall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.supercall.configurations.SupercallConfig;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    SupercallConfig supercallConfig;

    @Override
    public String hello() {
        return String.valueOf(supercallConfig.isDev());
    }
}
