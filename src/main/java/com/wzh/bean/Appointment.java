package com.wzh.bean;

import java.io.Serializable;

/**
 * appointment
 * @author 
 */
public class Appointment implements Serializable {
    private Integer appId;

    private Object appState;

    private String appReason;

    private String stuId;

    private Integer expId;

    private static final long serialVersionUID = 1L;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Object getAppState() {
        return appState;
    }

    public void setAppState(Object appState) {
        this.appState = appState;
    }

    public String getAppReason() {
        return appReason;
    }

    public void setAppReason(String appReason) {
        this.appReason = appReason;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public Integer getExpId() {
        return expId;
    }

    public void setExpId(Integer expId) {
        this.expId = expId;
    }
}