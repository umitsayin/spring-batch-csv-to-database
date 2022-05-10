package com.springbatch.example.repository;

import com.springbatch.example.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplooyeRepository extends JpaRepository<Employee,Integer> {
}
