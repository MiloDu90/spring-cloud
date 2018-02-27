package com.jk51.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:
 * 作者: gaojie
 * 创建日期: 2018-02-26
 * 修改记录:
 */
@RestController
public class ZuulController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/local")
    public String hi(){

        return "hi i am from port: " + port;
    }



}
