package com.mysqlconnect.Dao;

import com.mysqlconnect.myclass.People;

import java.util.List;


public interface PeopleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
    List<People> selectPeople();//查询数据库中的所有数据
}