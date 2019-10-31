package com.sinsuren.sample.service.demo.service.impl;

import com.sinsuren.sample.service.demo.service.RandomService;
import org.springframework.stereotype.Service;

@Service
public class RandomServiceImpl implements RandomService {
    @Override
    public Integer getRandom() {
        return (int)(Math.random()*1000);
    }
}
