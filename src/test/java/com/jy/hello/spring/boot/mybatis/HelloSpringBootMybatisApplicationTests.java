package com.jy.hello.spring.boot.mybatis;

import com.jy.hello.spring.boot.mybatis.entity.Users;
import com.jy.hello.spring.boot.mybatis.mapper.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringBootMybatisApplication.class)
public class HelloSpringBootMybatisApplicationTests {

    @Autowired
    private UsersMapper usermapper;

    @Test
    public void testpage(){
        List<Users> users = usermapper.selectAll();
        for(Users user : users){
            System.out.println(user.getName());
        }

    }

}
