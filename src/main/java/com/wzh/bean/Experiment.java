package com.wzh.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * experiment
 * @author 
 */
public class Experiment implements Serializable {
    private Integer expId;

    private String expName;

    private String expNote;

    private Byte expUsed;

    private Date expDate;

    private Object expSection;

    private Short labId;

    private String resId;

    private static final long serialVersionUID = 1L;

    public Integer getExpId() {
        return expId;
    }

    public void setExpId(Integer expId) {
        this.expId = expId;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getExpNote() {
        return expNote;
    }

    public void setExpNote(String expNote) {
        this.expNote = expNote;
    }

    public Byte getExpUsed() {
        return expUsed;
    }

    public void setExpUsed(Byte expUsed) {
        this.expUsed = expUsed;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Object getExpSection() {
        return expSection;
    }

    public void setExpSection(Object expSection) {
        this.expSection = expSection;
    }

    public Short getLabId() {
        return labId;
    }

    public void setLabId(Short labId) {
        this.labId = labId;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }
}