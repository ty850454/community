package com.dreammakerteam.community.post.domain;

import com.dreammakerteam.community.domian.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 社区-帖子
 * @author ty
 * @date 2018/3/11 下午 10:06
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostEntity extends BaseEntity {
    private static final long serialVersionUID = -7680565740704239492L;
    private String title;
}
