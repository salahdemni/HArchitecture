package hstl;

import java.net.InetAddress;
import java.util.GregorianCalendar;
 
public class PingRRT {
 
  public long RRT(String ipAddress) {
	  long s1 = 0;
    try {
      
      InetAddress inet = InetAddress.getByName(ipAddress);
 
      System.out.println("Sending Ping Request to " + ipAddress);
 
      long finish = 0;
      long start = new GregorianCalendar().getTimeInMillis();
      
      if (inet.isReachable(10000)){
        finish = new GregorianCalendar().getTimeInMillis();
        System.out.println("Ping RTT: " + (finish - start + "ms"));
        s1=finish - start;
        
      } else {
    	  System.out.println(ipAddress + " NOT reachable.");
      }
      return s1;
    } catch ( Exception e ) {
    	System.out.println("Exception:" + e.getMessage());
    }
    return s1;
  }
  
}
 
