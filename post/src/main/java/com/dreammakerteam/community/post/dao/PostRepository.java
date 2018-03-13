package com.dreammakerteam.community.post.dao;

import com.dreammakerteam.community.dao.BaseRepository;
import com.dreammakerteam.community.post.domain.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 文章存储库
 * @author ty
 * @date 2018/3/13 下午 8:24
 */
public interface PostRepository extends BaseRepository<PostEntity> {
}
