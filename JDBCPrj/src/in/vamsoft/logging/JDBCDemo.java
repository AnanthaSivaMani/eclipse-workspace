package in.vamsoft.logging;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import in.vamsoft.logging.data.DBConnectionUtil;

public class JDBCDemo {
  
  public static Logger logger=Logger.getLogger(JDBCDemo.class);

  public static void main(String[] args) {
    
    logger.info("Main method excecuting..........");
    
    
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet = null;
    try {
     
       connection  = DBConnectionUtil.getConnection();
      logger.info("Connection Done");
      statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
      resultSet=statement.executeQuery("select empid,fname,salary,doj,deptid from emp_siva");
      ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
      int columnCount=resultSetMetaData.getColumnCount();
      
      for(int i=1;i<=columnCount;i++) {
        System.out.print(resultSetMetaData.getColumnName(i)+"\t\t");
      }
      System.out.println();
      while(resultSet.next()) {
        System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2)+"\t\t"+resultSet.getDouble(3)+"\t\t"+resultSet.getDate(4)+"\t\t"+resultSet.getInt(5)); 
      }
      System.out.println("Going back in Result Set");
      resultSet.previous();
      
      resultSet.absolute(5);
      resultSet.updateString(2, "siva");
      resultSet.updateRow();
      System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2)+"\t\t"+resultSet.getDouble(3)+"\t\t"+resultSet.getDate(4)+"\t\t"+resultSet.getInt(5));
    } catch (SQLException e) {
      logger.error("Error while establshing connection",e);
      e.printStackTrace();
    }
    finally {
      try {
        resultSet.close();
        statement.close();
        DBConnectionUtil.closeConnection(connection); 
      }
      catch(SQLException e) {
        logger.error("Error while closing connection",e);
      }
      
    }
  

  }

}
