package com.xinhai.demo.api;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;


/**
 * EmployeeService服务类接口
 *
 * @author xinhai conper 2016-03-10
 * @version 1.0
 */
public interface EmployeeService {

  Employee findEmployee(String id);

  void createEmployee(Employee employee);

  void updateEmployee(String employeeId, Employee employee);

  void deleteEmployee(String id);

  void deleteEmployees(List<String> employeeIds);

  List<Employee> findAllEmployee();

  List<JSONObject> getAllEmployee(Map<String, Object> parameters);
}
