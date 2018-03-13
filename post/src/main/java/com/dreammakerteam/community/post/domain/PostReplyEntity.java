package com.dreammakerteam.community.post.domain;

import com.dreammakerteam.community.domian.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * 文章回复
 * @author ty
 * @date 2018/3/13 下午 8:16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class PostReplyEntity extends BaseEntity {
    private static final long serialVersionUID = 6136290590094200408L;
    /** 文章id */
    private Long postId;
    /** 回复目标 */
    private Long replyTo;
    /** 回复内容 */
    private String content;
}
