package in.vamsoft.dao;

import java.util.List;

import in.vamsoft.entities.Employee;

public interface EmployeeDAO {

  boolean addEmployee(Employee e);

  boolean removeEmployee(int employeeID);

  Employee findEmployeeById(int employeeID);

  List<Employee> getAllEmployees();

}