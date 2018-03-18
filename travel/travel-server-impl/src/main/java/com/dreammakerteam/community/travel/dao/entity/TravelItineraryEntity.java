package com.dreammakerteam.community.travel.dao.entity;

import com.dreammakerteam.community.core.domian.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * 旅行线路
 * @author ty
 * @date 2018/3/18 下午 1:11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class TravelItineraryEntity extends BaseEntity {
    private static final long serialVersionUID = -8496551779135590141L;
    /** id*/
    private String id;
    /** 线路标题*/
    private String title;
    /** 人数上限*/
    private String maximum;
    /** 自动开团开关*/
    private String autoGroupSwitch;
    /** 自动开团规则*/
    private String autoGroupRule;
    /** 冗余:天数*/
    private String days;
    /** 冗余:行程时长*/
    private String duration;
    /** 单位*/
    private String price;
}
