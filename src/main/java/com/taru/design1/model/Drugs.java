package com.taru.design1.model;

import java.util.List;

public class Drugs {
    private String drugStackId;
    private String drugsId;
    private String drugsName;
    private String drugsTypeId;
    private String hpReply;
    private String mpReply;
    private List<String> drugs;

    public List<String> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<String> drugs) {
        this.drugs = drugs;
    }

    public String getDrugStackId() {
        return drugStackId;
    }

    public void setDrugStackId(String drugStackId) {
        this.drugStackId = drugStackId;
    }

    public String getDrugsId() {
        return drugsId;
    }

    public void setDrugsId(String drugsId) {
        this.drugsId = drugsId;
    }

    public String getDrugsName() {
        return drugsName;
    }

    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName;
    }

    public String getDrugsTypeId() {
        return drugsTypeId;
    }

    public void setDrugsTypeId(String drugsTypeId) {
        this.drugsTypeId = drugsTypeId;
    }

    public String getHpReply() {
        return hpReply;
    }

    public void setHpReply(String hpReply) {
        this.hpReply = hpReply;
    }

    public String getMpReply() {
        return mpReply;
    }

    public void setMpReply(String mpReply) {
        this.mpReply = mpReply;
    }
}
