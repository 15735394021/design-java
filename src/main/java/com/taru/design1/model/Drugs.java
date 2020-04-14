package com.taru.design1.model;

import com.taru.design1.vo.ArchivesDetail;

import java.util.List;

public class Drugs {
    private String drugStackId;
    private String drugsId;
    private String drugsName;
    private String drugsTypeId;
    private Integer drugsNum;
    private String hpReply;
    private String mpReply;
    private List<ArchivesDetail> drugs;

    public Integer getDrugsNum() {
        return drugsNum;
    }

    public void setDrugsNum(Integer drugsNum) {
        this.drugsNum = drugsNum;
    }

    public List<ArchivesDetail> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<ArchivesDetail> drugs) {
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
