package com.cloud.provider.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户控制层
 * @author: lcl
 * @create: 2019-07-24 11:01
 **/

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("/hi/{id}")
    public String getUser(@PathVariable String id){
     return "hi"+id;
 }

}
