package com.dreammakerteam.community.dao;

import com.dreammakerteam.community.domian.BaseEntity;
import com.dreammakerteam.community.enums.ValidEnum;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.Date;

public class BaseRepositoryImpl<T extends BaseEntity, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

    public BaseRepositoryImpl(@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection") JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public <S extends T> S save(S entity) {
        Date now = new Date();
        entity.setCreateTime(now);
        entity.setUpdateTime(now);
        entity.setValid(ValidEnum.VALID.getValue());
        return super.save(entity);
    }
}
