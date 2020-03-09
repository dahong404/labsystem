package com.wzh.dao;

import com.wzh.bean.Appointment;

public interface AppointmentDao {
    int deleteByPrimaryKey(Integer appId);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    Appointment selectByPrimaryKey(Integer appId);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
}