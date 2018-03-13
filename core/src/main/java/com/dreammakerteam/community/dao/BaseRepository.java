package com.dreammakerteam.community.dao;

import com.dreammakerteam.community.domian.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * 基础存储库
 * @param <T>
 * @author ty
 * @date 2018/3/13 下午 9:27
 */
@NoRepositoryBean
public interface  BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

}
