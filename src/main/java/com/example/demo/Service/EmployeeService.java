package com.example.demo.Service;

import com.example.demo.Entity.BaseEntity;
import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class EmployeeService extends BaseService<Employee> {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public Employee update(Employee entity) {
        Employee existingEmployee = getById(entity.getId());

        if (existingEmployee != null) {
            existingEmployee.setEmail(entity.getEmail());
            existingEmployee.setUpdatedAt(Instant.now());
            return repository.save(existingEmployee);
        }

        return null;
    }

    public Optional<Employee> getByEmail(String email) {
        return repository.findByEmail(email);
    }
}