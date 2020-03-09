package com.wzh.dao;

import com.wzh.bean.Experiment;

public interface ExperimentDao {
    int deleteByPrimaryKey(Integer expId);

    int insert(Experiment record);

    int insertSelective(Experiment record);

    Experiment selectByPrimaryKey(Integer expId);

    int updateByPrimaryKeySelective(Experiment record);

    int updateByPrimaryKey(Experiment record);
}