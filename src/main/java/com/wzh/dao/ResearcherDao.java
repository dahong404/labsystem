package com.wzh.dao;

import com.wzh.bean.Researcher;

public interface ResearcherDao {
    int deleteByPrimaryKey(String resId);

    int insert(Researcher record);

    int insertSelective(Researcher record);

    Researcher selectByPrimaryKey(String resId);

    int updateByPrimaryKeySelective(Researcher record);

    int updateByPrimaryKey(Researcher record);
}