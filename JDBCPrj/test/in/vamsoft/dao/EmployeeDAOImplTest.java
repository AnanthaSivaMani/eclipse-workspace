package in.vamsoft.dao;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import in.vamsoft.entities.Employee;

public class EmployeeDAOImplTest {

  static EmployeeDAO employeeDAO;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    employeeDAO = EmployeeDAOFactory.getEmployeeDAO();
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Test
  public void testAddEmployee() {
    Employee employee = new Employee(500, "jhj", 60000.0, LocalDate.of(2017, 11, 01), 65);
    boolean result = employeeDAO.addEmployee(employee);
    assertTrue(result);
  }
  
  
  @Test
  @Ignore
 public void testRemoveEmployee() {
    assertTrue(employeeDAO.removeEmployee(500));

 }
  
  @Test
 public void testFindEmployee() {
    Employee employee=employeeDAO.findEmployeeById(000);
    //assertEquals(2400, 24000);
  }

}
