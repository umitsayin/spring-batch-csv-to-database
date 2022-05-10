package com.springbatch.example.config;

import com.springbatch.example.model.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmplooyeProcessor implements ItemProcessor<Employee,Employee> {

    @Override
    public Employee process(Employee employee) throws Exception {
        return employee;
    }

}
