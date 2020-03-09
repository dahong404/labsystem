package com.wzh.bean;

import java.io.Serializable;

/**
 * researcher
 * @author 
 */
public class Researcher implements Serializable {
    private String resId;

    private String resPassword;

    private String resName;

    private Object resTitle;

    private String resPhone;

    private static final long serialVersionUID = 1L;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getResPassword() {
        return resPassword;
    }

    public void setResPassword(String resPassword) {
        this.resPassword = resPassword;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public Object getResTitle() {
        return resTitle;
    }

    public void setResTitle(Object resTitle) {
        this.resTitle = resTitle;
    }

    public String getResPhone() {
        return resPhone;
    }

    public void setResPhone(String resPhone) {
        this.resPhone = resPhone;
    }
}