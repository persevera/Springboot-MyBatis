package com.mysqlconnect.service;

import com.mysqlconnect.myclass.People;

import java.util.List;

//Service层接口
public interface selectservice {
    List<People>  selectall();
}
