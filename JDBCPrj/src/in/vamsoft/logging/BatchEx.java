package in.vamsoft.logging;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.vamsoft.logging.data.DBConnectionUtil;

public class BatchEx {

  public static void main(String[] args) {
    try(Connection connection=DBConnectionUtil.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("insert into emp_siva values(?,?,?,?,?)");
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);){
      String answer="no";
      do {
        System.out.println("Enter id:");
        int id=scanner.nextInt();
        System.out.println("Enter Name:");
        String name=scanner2.next();
        System.out.println("Enter Salary");
        double sal=scanner.nextDouble();
        System.out.println("Enter DOJ in format dd-MM-yyyy");
        String doj=scanner2.next();
        System.out.println("Enter deptId:");
        int deptid=scanner.nextInt();
        
        
      }
      
      
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
