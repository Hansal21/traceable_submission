package com.tracable.ai.controller;

import com.tracable.ai.entity.APIEntity;
import com.tracable.ai.service.APIService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class APIController {
    private final APIService apiService;
    @GetMapping("get")
    public ResponseEntity<Object> api(@RequestParam("id") Integer id){
        return new ResponseEntity<>(apiService.fun(id), HttpStatus.OK);
    }
    @GetMapping("getapi")
    public ResponseEntity<Object> fun(@RequestParam("id") Integer id){
        return new ResponseEntity<>("Get API called", HttpStatus.OK);
    }
    @PostMapping("add")
    public ResponseEntity<Object> addEntity(@RequestBody APIEntity apiEntity){
        return new ResponseEntity<>(apiService.addEntity(apiEntity),HttpStatus.OK);
    }
}
