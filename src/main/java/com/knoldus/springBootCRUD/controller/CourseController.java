package com.knoldus.springBootCRUD.controller;

import com.knoldus.springBootCRUD.model.Employee;
import com.knoldus.springBootCRUD.service.EmployeeService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    EmployeeService service;

    // Get Request
    @RequestMapping("/showLists")
    @ResponseBody
    public List<Employee> showList(){
        return service.getEmployeeList();
    }

    // Post request
    @PostMapping("addEmployee")
    public void addEmployee(@RequestBody Employee employee){
        service.insertNewEmployee(employee);
    }

    // Put Request

    @PutMapping("updateEmployee/{id}")
    public void updateEmployee(@RequestBody Employee employee,@PathVariable Integer id){
        service.updateEmployee(employee,id);
    }

    // Delete Request

    @DeleteMapping("deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        service.deleteById(id);
    }
}
