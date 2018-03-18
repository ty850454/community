package com.dreammakerteam.community.core.dao;

import com.dreammakerteam.community.core.domian.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 基础存储库
 * @param <T>
 * @author ty
 * @date 2018/3/13 下午 9:27
 */
@NoRepositoryBean
public interface  BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

}
