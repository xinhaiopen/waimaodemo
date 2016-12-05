package com.xinhai.demo.business;

import com.alibaba.fastjson.JSONObject;
import com.xinhai.demo.api.Employee;
import com.xinhai.demo.api.EmployeeService;
import com.xinhai.demo.dao.EmployeeMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * EmployeeService接口实现类.
 *
 * @author xinhai conper 2016-03-11
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
  Logger logger = LogManager.getLogger(EmployeeServiceImpl.class.getName());
  @Autowired
  private EmployeeMapper employeeMapper;


  public void createEmployee(Employee employee) {
    employeeMapper.createEmployee(employee);
  }

  public void updateEmployee(String employeeId, Employee employee) {
    employeeMapper.updateEmployee(employeeId, employee);
  }

  public void deleteEmployees(List<String> employeeIds) {
    employeeMapper.deleteEmployeeList(employeeIds);
  }

  public void deleteEmployee(String employeeId) {
    employeeMapper.deleteEmployee(employeeId);
  }

  /**
   * 查询所有雇员信息.
   *
   * @return 雇员信息集合
   */
  public List<Employee> findAllEmployee() {
    try {
      return employeeMapper.getEmployeeList();
    } catch (Exception ex) {
      logger.error("", ex);
    }

    return new ArrayList<>();
  }

  @Override
  public List<JSONObject> getAllEmployee(Map<String, Object> parameters) {
    List<JSONObject> datas = employeeMapper.getAllEmployee(parameters);

    return datas;
  }

  public Employee findEmployee(String id) {
    Employee employee = employeeMapper.getEmployee(id);
    return employee;
  }
}
