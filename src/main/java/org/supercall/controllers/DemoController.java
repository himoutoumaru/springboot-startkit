package org.supercall.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.supercall.services.DemoServiceImpl;

@RestController
@RequestMapping("/demo")
@Api("示例控制器")
public class DemoController {

    @Autowired
    DemoServiceImpl demoService;

    @GetMapping
    @ApiOperation(value = "示例方法")
    String hello() {
        return demoService.hello();
    }
}
