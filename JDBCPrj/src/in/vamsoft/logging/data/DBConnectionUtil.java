package in.vamsoft.logging.data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;


public class DBConnectionUtil{
  public static Logger logger = Logger.getLogger(DBConnectionUtil.class);

  public static Connection getConnection() {

    String driver = null;
    String url = null;
    String username = null;
    String password = null;
    Connection connection = null;

    try {
      FileReader reader = new FileReader("src//db.properties");
      Properties properties = new Properties();
      properties.load(reader);
      driver = properties.getProperty("driver");
      url = properties.getProperty("url");
      username = properties.getProperty("username");
      password = properties.getProperty("password");
      Class.forName(driver);
      connection = DriverManager.getConnection(url, username, password);
      logger.info("Connection Done");

    } catch (FileNotFoundException e) {
      logger.error("DB properties file not found", e);
    } catch (IOException e) {
      logger.error("DB properties file not found", e);
    } catch (ClassNotFoundException e) {
      logger.error("Driver class not found", e);
    } catch (SQLException e) {
      logger.error("SQL Exception",e);
    }

    return connection;

  }

  public static void closeConnection(Connection connection) {
    try {
      connection.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  public void m() {}

}
