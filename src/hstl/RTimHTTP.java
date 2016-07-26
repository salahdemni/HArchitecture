package hstl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class RTimHTTP {
	public long Time(String ipAddress) throws IOException{
		long elasedTime=-1;
		URL url = new URL("http://"+ipAddress);
		try{
	 
	 HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	 long starTime = System.currentTimeMillis();       
     conn.connect();
     elasedTime = System.currentTimeMillis() - starTime;
    
     conn.disconnect();}
		catch (Exception e){
			elasedTime=5000;
			
		}
		 return elasedTime;
	 
}
	
}
