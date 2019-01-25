package org.supercall.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.supercall.services.DemoServiceImpl;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoServiceImpl demoService;

    @GetMapping
    String hello() {
        return demoService.hello();
    }
}
