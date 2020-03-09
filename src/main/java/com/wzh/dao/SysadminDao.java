package com.wzh.dao;

import com.wzh.bean.Sysadmin;

public interface SysadminDao {
    int deleteByPrimaryKey(String saId);

    int insert(Sysadmin record);

    int insertSelective(Sysadmin record);

    Sysadmin selectByPrimaryKey(String saId);

    int updateByPrimaryKeySelective(Sysadmin record);

    int updateByPrimaryKey(Sysadmin record);
}