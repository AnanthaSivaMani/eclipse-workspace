package in.vamsoft.dao;

public class EmployeeDAOFactory {
  
  public static EmployeeDAO getEmployeeDAO() {
    return new  EmployeeDAOImpl();
  }

}
