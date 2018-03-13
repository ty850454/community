package com.dreammakerteam.community.post.dao;

import com.dreammakerteam.community.dao.BaseRepository;
import com.dreammakerteam.community.post.domain.PostReplyEntity;

import java.util.List;

/**
 * 文章回复存储库
 * @author ty
 * @date 2018/3/13 下午 8:24
 */
public interface PostReplyRepository extends BaseRepository<PostReplyEntity> {

    /**
     * 通过文章id查找所有回复
     * @param postId 文章
     * @return List<PostReplyEntity>
     */
    List<PostReplyEntity> findByPostId(Long postId);
}
