package com.xinhai.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.xinhai.demo.api.Employee;
import com.xinhai.demo.api.EmployeeService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 雇员信息控制类.
 */
@Controller
@RequestMapping("/demo")
public class EmployeeController {
  Logger logger = LogManager.getLogger(EmployeeController.class.getName());

  @Autowired
  private EmployeeService employeeService;

  /**
   * 获取单个雇员信息.
   *
   * @param id 雇员信息主键
   * @return 雇员信息
   */
  @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
  @ResponseBody
  public Employee getEmployee(@PathVariable("id") String id) {
    try {
      Employee employee = employeeService.findEmployee(id);
      return employee;
    } catch (Exception ex) {
      logger.error("", ex);
    }

    return null;
  }

  @RequestMapping(value = "/employee", method = RequestMethod.GET)
  @ResponseBody
  public List<Employee> getEmployee() {
    try {
      return employeeService.findAllEmployee();
    } catch (Exception e) {
      logger.error("", e);
    }

    return new ArrayList<>();
  }

  @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
  @ResponseBody
  public List<JSONObject> getEmployees(@PathVariable("id") int id) {
    try {
      Map<String, Object> parameters = new HashMap<>();
      parameters.put("id", id);
      return employeeService.getAllEmployee(parameters);
    } catch (Exception e) {
      logger.error("", e);
    }

    return null;
  }

  @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
  @ResponseBody
  public Boolean updateEmployee(@PathVariable("id") String id, @RequestBody Employee employee) {
    try {
      employeeService.updateEmployee(id, employee);
      return true;
    } catch (Exception e) {
      logger.error("", e);
    }

    return false;
  }

  @RequestMapping(value = "/employee", method = RequestMethod.POST)
  @ResponseBody
  public Boolean addEmployee(@RequestBody Employee employee) {
    try {
      employeeService.createEmployee(employee);
      return true;
    } catch (Exception e) {
      logger.error("", e);
    }

    return false;
  }

  @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
  @ResponseBody
  public Boolean deleteEmployee(@PathVariable("id") String id) {
    try {
      employeeService.deleteEmployee(id);
      return true;
    } catch (Exception e) {
      logger.error("", e);
    }

    return false;
  }
}
