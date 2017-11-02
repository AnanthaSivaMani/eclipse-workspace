package in.vamsoft.logging;

import org.apache.log4j.Logger;

public class LoggingDemo {
  
  public static Logger logger=Logger.getLogger(LoggingDemo.class);
  

  public static void main(String[] args) {
   try {
     logger.info("Main method Started");
     System.out.println("Main Executing");
     int result = 10/0;
     logger.info("Main Method finished");

   } catch(ArithmeticException ae) {
     logger.error("An Error Occured in Main",ae);
   }

  }

}
