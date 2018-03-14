package com.dreammakerteam.community.post.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 文章请求vo
 * @author ty
 * @date 2018/3/14 下午 10:03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PostRequestVo extends BasePostVo {
    private static final long serialVersionUID = -7495762223226505201L;
}
