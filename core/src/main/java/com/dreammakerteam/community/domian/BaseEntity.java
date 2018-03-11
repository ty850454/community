package com.dreammakerteam.community.domian;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础数据库映射实体
 * @author ty
 * @date 2018/3/11 下午 9:54
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -2434594564476399405L;
    private Long id;
    private Date createTime;
    private Date updateTime;
    private Boolean valid;
}
