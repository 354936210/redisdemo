package com.heimabird.redisdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/**
 * @author hellobird
 * @date 2019/10/24
 */
@RestController
public class TestController {


    @Autowired
    JedisPool jedisPool;

    @RequestMapping("/test")
    public String gettest(){
        jedisPool.getResource().set("test","wangchao");
        return "message";
    }

}
