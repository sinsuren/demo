package com.sinsuren.sample.service.demo.controller;

import com.sinsuren.sample.service.demo.service.SampleService;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/sample", method = RequestMethod.POST)
    @Timed
    public ResponseEntity getResponse() {
        Integer value = sampleService.add(3,4);
        return new ResponseEntity<>(value, HttpStatus.OK);
    }
}
