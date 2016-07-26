package hstl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class HAProxyController {
	
	public void update(String ip) throws IOException{
		
        BufferedReader r = new BufferedReader(new FileReader("/etc/haproxy/haproxy.cfg"));
		
		String in="";
		List<String> lines = new ArrayList<String>();
		while ((in = r.readLine()) != null) {
			lines.add(in);
		}
		r.close();
		lines.remove(lines.size()-1);
        lines.add("server 1-www "+ip+":80 check");
        PrintWriter w = new PrintWriter(new FileWriter("/etc/haproxy/haproxy.cfg"));
        for (String line : lines)
            w.println(line);
        w.close();
        
        try {
        	String[] cmd = {"/bin/bash","-c","echo salah| sudo -S service haproxy restart"};
            Process pb = Runtime.getRuntime().exec(cmd);
            BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(pb.getInputStream()));

			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}
			
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
		

	
	

}
