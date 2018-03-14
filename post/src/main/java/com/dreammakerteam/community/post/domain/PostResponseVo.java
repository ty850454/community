package com.dreammakerteam.community.post.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * 文章响应vo
 * @author ty
 * @date 2018/3/14 下午 10:03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PostResponseVo extends BasePostVo {
    private static final long serialVersionUID = -1088672746083803015L;
    private Date createTime;
    private Date updateTime;
}
