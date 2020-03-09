package com.wzh.bean;

import java.io.Serializable;

/**
 * sysadmin
 * @author 
 */
public class Sysadmin implements Serializable {
    private String saId;

    private String saPassword;

    private static final long serialVersionUID = 1L;

    public String getSaId() {
        return saId;
    }

    public void setSaId(String saId) {
        this.saId = saId;
    }

    public String getSaPassword() {
        return saPassword;
    }

    public void setSaPassword(String saPassword) {
        this.saPassword = saPassword;
    }
}