package com.mysqlconnect.service.serviceImpl;

import com.mysqlconnect.Dao.PeopleMapper;
import com.mysqlconnect.myclass.People;
import com.mysqlconnect.service.selectservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service//Service注解将这个类注入到容器中
public class selectserviceImpl implements selectservice {
    //引入接口对象作为引用类型属性
    @Resource
    private PeopleMapper peopleMapper;
//service层调用Dao层
    @Override
    public List<People> selectall() {
        return peopleMapper.selectPeople();
    }
}
