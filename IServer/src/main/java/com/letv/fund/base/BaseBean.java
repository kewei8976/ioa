package com.letv.fund.base;

import java.util.Date;

/**
 * Created by Nathan.yan on 14-9-15.
 * Email:yanliang.yl@hotamil.com
 */
public class BaseBean {
    private Long id;
    private String modified; // 姓名

    private Date modifydatatime; // 创建时间
    private String created; // 姓名
    private Date createdatetime; // 创建时间
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }


    public Date getModifydatatime() {
        return modifydatatime;
    }

    public void setModifydatatime(Date modifydatatime) {
        this.modifydatatime = modifydatatime;
    }


    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "id=" + id +
                ", modified='" + modified + '\'' +
                ", modifydatatime=" + modifydatatime +
                ", created='" + created + '\'' +
                ", createdatetime=" + createdatetime +
                ", status=" + status +
                '}';
    }
}
