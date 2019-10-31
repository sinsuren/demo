package com.sinsuren.sample.service.demo.service.impl;

import com.sinsuren.sample.service.demo.service.RandomService;
import com.sinsuren.sample.service.demo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private RandomService randomService;

    @Override
    public Integer add(Integer first, Integer second) {
        return (first + second) * randomService.getRandom();
    }
}
