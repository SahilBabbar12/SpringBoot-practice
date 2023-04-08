package com.knoldus.springBootCRUD.service;

import com.knoldus.springBootCRUD.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class EmployeeService {
     List<Employee> employeeList=new ArrayList<>(Arrays.asList(
            new Employee(101,"Sahil","JAVA"),
            new Employee(102,"Rahul","JAVA")
    ));

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void insertNewEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void updateEmployee(Employee employee, Integer id){
        for(Employee employee1:employeeList){
            if(employee1.getId()==id){
                employee1.setName(employee.getName());
                employee1.setStudio(employee.getStudio());
            }
        }
    }
    public void deleteById(Integer id){
        for(Employee employee1:employeeList){
            if(employee1.getId()==id){
                employeeList.remove(employee1);
            }
        }
    }
}
