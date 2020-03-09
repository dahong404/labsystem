package com.wzh.bean;

import java.io.Serializable;

/**
 * lab
 * @author 
 */
public class Lab implements Serializable {
    private Short labId;

    private String labName;

    private Object labState;

    private String labRoom;

    private Byte labSize;

    private static final long serialVersionUID = 1L;

    public Short getLabId() {
        return labId;
    }

    public void setLabId(Short labId) {
        this.labId = labId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public Object getLabState() {
        return labState;
    }

    public void setLabState(Object labState) {
        this.labState = labState;
    }

    public String getLabRoom() {
        return labRoom;
    }

    public void setLabRoom(String labRoom) {
        this.labRoom = labRoom;
    }

    public Byte getLabSize() {
        return labSize;
    }

    public void setLabSize(Byte labSize) {
        this.labSize = labSize;
    }
}