package com.microservices.department.service;


import com.microservices.department.entity.Department;
import com.microservices.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {

        log.info("Inside saveDepartment in Department Service");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside findByDepartmentId in Department Service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
