package com.wzh.dao;

import com.wzh.bean.Lab;

public interface LabDao {
    int deleteByPrimaryKey(Short labId);

    int insert(Lab record);

    int insertSelective(Lab record);

    Lab selectByPrimaryKey(Short labId);

    int updateByPrimaryKeySelective(Lab record);

    int updateByPrimaryKey(Lab record);
}