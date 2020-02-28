package com.jy.hello.spring.boot.mybatis.mapper;

import com.jy.hello.spring.boot.mybatis.entity.Config;
import com.jy.hello.spring.boot.mybatis.entity.ConfigExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.MyMapper;

public interface ConfigMapper extends MyMapper<Config> {
    int countByExample(ConfigExample example);

    int deleteByExample(ConfigExample example);

    List<Config> selectByExample(ConfigExample example);

    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);
}