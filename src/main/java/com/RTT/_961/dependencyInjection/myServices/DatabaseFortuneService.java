package com.RTT._961.dependencyInjection.myServices;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices {

    @Override
    public String getFortune() {
        // TODO Auto-generated method stub
        return "Database connection";
    }
}

