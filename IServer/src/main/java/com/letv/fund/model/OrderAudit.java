package com.letv.fund.model;

import java.util.Date;

public class OrderAudit {

    private Integer coaId;

    private String foreUid;

    private String foreNickname;

    private Integer backUid;

    private String backName;

    private String backLoginname;

    private Byte auditFlag;

    private Integer auditUid;

    private String auditName;

    private Integer createUid;

    private Date createAt;

    private Date updateAt;

    public Integer getCoaId() {
        return coaId;
    }

    public void setCoaId(Integer coaId) {
        this.coaId = coaId;
    }

    public String getForeUid() {
        return foreUid;
    }

    public void setForeUid(String foreUid) {
        this.foreUid = foreUid == null ? null : foreUid.trim();
    }

    public String getForeNickname() {
        return foreNickname;
    }

    public void setForeNickname(String foreNickname) {
        this.foreNickname = foreNickname == null ? null : foreNickname.trim();
    }

    public Integer getBackUid() {
        return backUid;
    }

    public void setBackUid(Integer backUid) {
        this.backUid = backUid;
    }

    public String getBackName() {
        return backName;
    }

    public void setBackName(String backName) {
        this.backName = backName == null ? null : backName.trim();
    }

    public String getBackLoginname() {
        return backLoginname;
    }

    public void setBackLoginname(String backLoginname) {
        this.backLoginname = backLoginname == null ? null : backLoginname.trim();
    }

    public Byte getAuditFlag() {
        return auditFlag;
    }

    public void setAuditFlag(Byte auditFlag) {
        this.auditFlag = auditFlag;
    }

    public Integer getAuditUid() {
        return auditUid;
    }

    public void setAuditUid(Integer auditUid) {
        this.auditUid = auditUid;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}