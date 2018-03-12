package com.dreammakerteam.community.post.dao;

import com.dreammakerteam.community.dao.BaseRepository;
import com.dreammakerteam.community.post.domain.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PostRepository extends BaseRepository<PostEntity, Long> {
}
