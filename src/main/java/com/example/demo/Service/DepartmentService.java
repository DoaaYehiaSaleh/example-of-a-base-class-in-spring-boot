package com.example.demo.Service;

import com.example.demo.Entity.Department;
import com.example.demo.Repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class DepartmentService extends BaseService<Department> {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public Department create(Department entity) {
        entity.setCreatedAt(Instant.now());
        entity.setUpdatedAt(Instant.now());
        return repository.save(entity);
    }

    @Override
    public Department update(Department entity) {
        Department existingDepartment = getById(entity.getId());

        if (existingDepartment != null) {
            existingDepartment.setEmail(entity.getEmail());
            existingDepartment.setUpdatedAt(Instant.now());
            return repository.save(existingDepartment);
        }

        return null;
    }

    public Optional<Department> getByEmail(String email) {
        return repository.findByEmail(email);
    }
}
