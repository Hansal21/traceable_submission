package com.tracable.ai.service.impl;

import com.tracable.ai.entity.APIEntity;
import com.tracable.ai.repository.APIRepository;
import com.tracable.ai.service.APIService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class APIServiceImpl implements APIService {
    private final APIRepository apiRepository;
    @Override
    public APIEntity fun(Integer id) {
        return apiRepository.getAPIEntitiesById(id);
    }

    @Override
    public APIEntity addEntity(APIEntity apiEntity) {
        return apiRepository.save(apiEntity);
    }
}
