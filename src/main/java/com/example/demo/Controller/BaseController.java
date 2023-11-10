package com.example.demo.Controller;

import com.example.demo.Entity.BaseEntity;
import com.example.demo.Repository.BaseRepository;
import com.example.demo.Service.BaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public class BaseController <T extends BaseEntity>{



        private final BaseService<T> service;


        public BaseController (BaseService<T> service){
            this.service = service;
        }
        @PostMapping("/save")
        public T create(@RequestBody T entity) {
            entity.setCreatedAt(Instant.now());
            entity.setUpdatedAt(Instant.now());
            return service.create(entity);
        }
@PutMapping("/update")
        public T update(@RequestBody T entity) {
            return service.update(entity);
        }


    }


