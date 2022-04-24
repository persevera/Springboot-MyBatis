package com.mysqlconnect.controller;

import com.mysqlconnect.myclass.People;
import com.mysqlconnect.service.serviceImpl.selectserviceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class test {
    //自动注入service对象
    @Resource
    private selectserviceImpl  selectservice;
  //发起请求/selectall,测试
    @RequestMapping(value = "/selectall")
    public  void   doselect(){
        List<People> selectall = selectservice.selectall();
        for (People people : selectall) {
            System.out.println(people);
        }
    }
}
