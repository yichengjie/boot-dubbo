package com.yicj.study.provider.serviceimpl;

import com.yicj.study.api.service.IUserService;
import com.yicj.study.provider.MyApplication;
import com.yicj.study.api.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = MyApplication.class)
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private IUserService userService ;

    @Test
    public void testQueryAllUser(){
       List<User> list =  userService.list() ;
        list.forEach(System.out::println);
    }
}
