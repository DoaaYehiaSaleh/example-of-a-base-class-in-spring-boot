package com.example.demo.Controller;

import com.example.demo.Entity.Department;
import com.example.demo.Service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepratmentController {
    private final DepartmentService service;

    public DepratmentController(DepartmentService service) {
        this.service = service;
    }


    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return service.create(department);
    }

    @PutMapping("/{id}")
    public Department updateEmployee(@PathVariable Long id, @RequestBody Department department) {
        department.setId(id);
        return service.update(department);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        return service.getById(id);
    }
    @GetMapping("/{email}")
    public Optional<Department> getDepartmentByEmail(@PathVariable String email) {
        return service.getByEmail(email);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAll();
    }
}
