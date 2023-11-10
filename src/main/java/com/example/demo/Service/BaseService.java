package com.example.demo.Service;

import com.example.demo.Entity.BaseEntity;
import com.example.demo.Repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public class BaseService<T extends BaseEntity> {


    private final BaseRepository<T> repository;


    public BaseService (BaseRepository<T> repository){
        this.repository = repository;
    }
    public T create(T entity) {
        entity.setCreatedAt(Instant.now());
        entity.setUpdatedAt(Instant.now());
        return repository.save(entity);
    }

    public T update(T entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public T getById(Long id) {
        Optional<T> optionalEntity = repository.findById(id);
        return optionalEntity.orElse(null);
    }

    public List<T> getAll() {
        return repository.findAll();
    }
}
