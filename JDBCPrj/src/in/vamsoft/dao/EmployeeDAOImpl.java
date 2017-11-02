package in.vamsoft.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import in.vamsoft.entities.Employee;
import in.vamsoft.logging.data.DBConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

  private Connection connection = null;
  private ResultSet resultSet;

  public EmployeeDAOImpl() {
    connection = DBConnectionUtil.getConnection();
  }

  /* (non-Javadoc)
   * @see in.vamsoft.dao.EmplpyeeDAO#addEmployee(in.vamsoft.entities.Employee)
   */
  @Override
  public boolean addEmployee(Employee e) {
    try (PreparedStatement preparedStatement = connection.prepareStatement("insert into emp_siva values(?,?,?,?,?)");) {
      preparedStatement.setInt(1, e.getEmployeeID());
      preparedStatement.setString(2, e.getEmployeeName());
      preparedStatement.setDouble(3, e.getEmployeeSalary());
      preparedStatement.setInt(5, e.getDepartmentID());
      preparedStatement.setDate(4, Date.valueOf(e.getDate()));
      int inserted = preparedStatement.executeUpdate();
      return inserted > 0 ? true : false;
    } catch (SQLException e1) {
      e1.printStackTrace();
    }
    return false;
  }

  /* (non-Javadoc)
   * @see in.vamsoft.dao.EmplpyeeDAO#removeEmployee(int)
   */
  @Override
  public boolean removeEmployee(int employeeID) {
    try (PreparedStatement preparedStatement = connection.prepareStatement("delete from emp_siva where empid=?");) {
      preparedStatement.setInt(1, employeeID);
      int rowsUpdated = preparedStatement.executeUpdate();
      return rowsUpdated > 0 ? true : false;

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }
  
  /* (non-Javadoc)
   * @see in.vamsoft.dao.EmplpyeeDAO#findEmployeeById(int)
   */
  @Override
  public Employee findEmployeeById(int employeeID) {
    try(PreparedStatement preparedStatement=connection.prepareStatement("select * from emp_siva where empid=?")){
      preparedStatement.setInt(1, employeeID);
      resultSet=preparedStatement.executeQuery();
      Employee employee=null;
      if(resultSet.next()) {
       employee =new Employee();
       employee.setEmployeeID(resultSet.getInt(1));
       employee.setEmployeeName(resultSet.getString(2));
       employee.setEmployeeSalary(resultSet.getDouble(3));
       employee.setDate(resultSet.getDate(4).toLocalDate());
      }
      return employee;
      
    } catch (SQLException e) {
      
      e.printStackTrace();
    }
    return null;
  }
  

  @Override
  public List<Employee> getAllEmployees(){
    try(PreparedStatement preparedStatement=connection.prepareStatement("select * from emp_siva")){   
      resultSet=preparedStatement.executeQuery();
      List<Employee> employees = new ArrayList<>();
      Employee employee=null;
      while(resultSet.next()) {
       employee =new Employee();
       employee.setEmployeeID(resultSet.getInt(1));
       employee.setEmployeeName(resultSet.getString(2));
       employee.setEmployeeSalary(resultSet.getDouble(3));
       employee.setDate(resultSet.getDate(4).toLocalDate());
       employees.add(employee);
      }
      return employees;
      
    } catch (SQLException e) {
      
      e.printStackTrace();
    }
    return null;
  }
  
  public boolean updateEmployee(Employee employee) {
    try(PreparedStatement preparedstatement = connection.prepareStatement("update empdemo set salary=?,deptid=? where empid=?")){
    
      preparedstatement.setDouble(1, employee.getEmployeeSalary());
      preparedstatement.setInt(2, employee.getDepartmentID());
      preparedstatement.setInt(3, employee.getEmployeeID());
      int rowsupdated = preparedstatement.executeUpdate();
      return rowsupdated > 0 ? true:false;
      
      
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }
    }

  