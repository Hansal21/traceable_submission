package com.tracable.ai.repository;

import com.tracable.ai.entity.APIEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface APIRepository extends JpaRepository<APIEntity,Integer> {
    public APIEntity getAPIEntitiesById(Integer id);
}
