/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webfront.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rlittle
 */
@ManagedBean(name="sessionBean")
@SessionScoped
public class ContractorSession {
    protected Integer clientId;

    /**
     * @return the clientId
     */
    public Integer getClientId() {
        return this.clientId;
    }

    /**
     * @param cid the clientId to set
     */
    public void setClientId(Integer cid) {
        clientId = cid;
    }
    
}