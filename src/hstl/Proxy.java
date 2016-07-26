package hstl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket; 
import java.net.Socket;

public class Proxy {
	static int port1=5000;
	public static void main(String arg[]) throws Exception  {
		
		/*SocketChannel socketChannel = SocketChannel.open();
		socketChannel.connect(new InetSocketAddress(8080));
		
		ByteBuffer buf = ByteBuffer.allocate(48);
		int bytesRead = socketChannel.read(buf);
		while(! socketChannel.finishConnect() ){
			System.out.println(bytesRead);
		}*/
		
		ServerSocket ss=new ServerSocket(8080);
	
	       Socket s=ss.accept();
	       BufferedReader sin=new BufferedReader(new InputStreamReader(s.getInputStream()));
	       String l=sin.readLine();
	       System.out.println(l);
	       
	    	  if(l!=null){
	    	   PeerClientInst pci=new PeerClientInst();
			  
				pci.ReturnIP(port1);
				Thread.sleep(1000);
	    	  ss.close();
	    	   s.close();
	    	   sin.close();
	  
	    	   //*ss=new ServerSocket(8080);
	    	   /*if(ss.isClosed()){
	    	   String[] args={};
		        Proxy.main(args);}*/
	    	   if(ss.isClosed()){
		    	   port1++;
		    	   
		       }
	    	 
	    	   Thread.sleep(1000);
				//*String[] args = new String[0]; // Or String[] args = {};
				main(arg);
				
	    	  }
	      
	       
	      
	     
		/*Selector selector = Selector.open();
		ServerSocketChannel ssChannel = ServerSocketChannel.open();
		ssChannel.configureBlocking(false);
		ssChannel.socket().bind(new InetSocketAddress(8080));
		ssChannel.register(selector, SelectionKey.OP_ACCEPT);
	    while (true) {
	      if (selector.select() <= 0) {
	        continue;
	      }
	      processReadySet(selector.selectedKeys());
	    }
	  }
	 public static void processReadySet(Set readySet) throws Exception {
		    Iterator iterator = readySet.iterator();
		    while (iterator.hasNext()) {
		      SelectionKey key = (SelectionKey) iterator.next();
		      iterator.remove();
		      if (key.isAcceptable()) {
		        ServerSocketChannel ssChannel = (ServerSocketChannel) key.channel();
		        SocketChannel sChannel = (SocketChannel) ssChannel.accept();
		        sChannel.configureBlocking(false);
		        sChannel.register(key.selector(), SelectionKey.OP_READ);
		      }
		      if (key.isReadable()) {
		        String msg = processRead(key);
		        if (msg.length() > 0) {
		          SocketChannel sChannel = (SocketChannel) key.channel();
		         /* ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes());
		          sChannel.write(buffer);*/
		        
		 /* public static String processRead(SelectionKey key) throws Exception {
		    SocketChannel sChannel = (SocketChannel) key.channel();
		    ByteBuffer buffer = ByteBuffer.allocate(1024);
		    int bytesCount = sChannel.read(buffer);
		    if (bytesCount > 0) {
		      buffer.flip();
		      return new String(buffer.array());
		    }
		    return "NoMessage";*/
		  
		
	    	   
	       

	}
	}
