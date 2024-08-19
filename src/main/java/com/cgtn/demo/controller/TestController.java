package com.cgtn.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: demo-java-project
 * @BelongsPackage: com.cgtn.controller
 * @ClassName TestController
 * @Author: nieminglan
 * @CreateTime: 2024-08-19  17:19
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/ping")
    public String  ping() {
        return "OK";
    }

}
