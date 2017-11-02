package in.vamsoft.logging;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.vamsoft.logging.data.DBConnectionUtil;

public class JDBCUpdateExample{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Employee salary you want to increase?");
    int amount = scanner.nextInt();
    System.out.println("Enter Employee ID");
    int empId = scanner.nextInt();

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    connection = DBConnectionUtil.getConnection();

    try {
      preparedStatement = connection.prepareStatement("update emp_siva set salary=salary+? where empid=?");
      preparedStatement.setInt(1, amount);
      preparedStatement.setInt(2, empId);
      int rowsUpdated = preparedStatement.executeUpdate();
      System.out.println(rowsUpdated);

    } catch (SQLException e) {
      e.printStackTrace();
    }

    finally {
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    DBConnectionUtil.closeConnection(connection);
  }

}
