package com.dreammakerteam.community.post.domain;

import com.dreammakerteam.community.core.domian.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * 社区-文章
 * @author ty
 * @date 2018/3/11 下午 10:06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class PostEntity extends BaseEntity {
    private static final long serialVersionUID = -7680565740704239492L;
    /** 标题 */
    private String title;
}
