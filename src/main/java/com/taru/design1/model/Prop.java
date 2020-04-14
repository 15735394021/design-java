package com.taru.design1.model;

import com.taru.design1.vo.ArchivesDetail;

import java.util.List;

public class Prop {
    private String propStackId;
    private String propId;
    private String propName;
    private String propTypeId;
    private String hpReply;
    private String mpReply;
    private Integer propNum;
    private List<ArchivesDetail> props;

    public Integer getPropNum() {
        return propNum;
    }

    public void setPropNum(Integer propNum) {
        this.propNum = propNum;
    }

    public List<ArchivesDetail> getProps() {
        return props;
    }

    public void setProps(List<ArchivesDetail> props) {
        this.props = props;
    }

    public String getPropStackId() {
        return propStackId;
    }

    public void setPropStackId(String propStackId) {
        this.propStackId = propStackId;
    }

    public String getPropId() {
        return propId;
    }

    public void setPropId(String propId) {
        this.propId = propId;
    }

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public String getPropTypeId() {
        return propTypeId;
    }

    public void setPropTypeId(String propTypeId) {
        this.propTypeId = propTypeId;
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
