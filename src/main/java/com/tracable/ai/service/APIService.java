package com.tracable.ai.service;

import com.tracable.ai.entity.APIEntity;
import org.springframework.http.ResponseEntity;

public interface APIService {

    APIEntity fun(Integer id);

    APIEntity addEntity(APIEntity apiEntity);
}
