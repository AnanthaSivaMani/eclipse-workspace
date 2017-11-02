package in.vamsoft.entities;

import java.time.LocalDate;

public class Employee {
  
  private int employeeID;
  private String employeeName;
  private double employeeSalary;
  private LocalDate date;
  private int departmentID;
  

  public Employee(int employeeID, String employeeName, double employeeSalary, LocalDate date, int departmentID) {
    super();
    this.employeeID = employeeID;
    this.employeeName = employeeName;
    this.employeeSalary = employeeSalary;
    this.date = date;
    this.departmentID = departmentID;
  }
  
  public int getEmployeeID() {
    return employeeID;
  }
  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }
  public String getEmployeeName() {
    return employeeName;
  }
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }
  public double getEmployeeSalary() {
    return employeeSalary;
  }
  public void setEmployeeSalary(double employeeSalary) {
    this.employeeSalary = employeeSalary;
  }
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public int getDepartmentID() {
    return departmentID;
  }
  public void setDepartmentID(int departmentID) {
    this.departmentID = departmentID;
  }
  
  public Employee() {
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public String toString() {
    return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeSalary="
        + employeeSalary + ", date=" + date + ", departmentID=" + departmentID + "]";
  }
  
  
  
  
  
  
  

}
