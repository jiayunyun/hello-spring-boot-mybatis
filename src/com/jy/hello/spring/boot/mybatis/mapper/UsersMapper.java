package com.jy.hello.spring.boot.mybatis.mapper;

import com.jy.hello.spring.boot.mybatis.entity.Users;
import com.jy.hello.spring.boot.mybatis.entity.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.MyMapper;

public interface UsersMapper extends MyMapper<Users> {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    List<Users> selectByExample(UsersExample example);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);
}