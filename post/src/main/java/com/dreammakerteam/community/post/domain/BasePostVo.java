package com.dreammakerteam.community.post.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 基础文章vo
 * @author ty
 * @date 2018/3/14 下午 10:03
 */
@Data
public abstract class BasePostVo implements Serializable {
    private static final long serialVersionUID = -2965055161631639341L;
    private String title;

}
