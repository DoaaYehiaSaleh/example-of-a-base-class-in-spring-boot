package com.example.demo.Repository;

import com.example.demo.Entity.BaseEntity;
import com.example.demo.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<Textends BaseEntity {
     Optional<T> findByEmail(String email);
}
