package hstl;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import net.tomp2p.connection.Bindings;
import net.tomp2p.connection.ChannelCreator;
import net.tomp2p.connection.ConnectionConfiguration;
import net.tomp2p.connection.DefaultConnectionConfiguration;
import net.tomp2p.futures.FutureBootstrap;
import net.tomp2p.futures.FutureDHT;
import net.tomp2p.futures.FutureDiscover;
import net.tomp2p.futures.FutureResponse;
import net.tomp2p.p2p.Peer;
import net.tomp2p.p2p.PeerMaker;
import net.tomp2p.p2p.builder.PingBuilder;
import net.tomp2p.peers.Number160;
import net.tomp2p.peers.PeerAddress;
import net.tomp2p.rpc.ObjectDataReply;
import net.tomp2p.rpc.PingRPC;
import net.tomp2p.storage.Data;


public class OldRequest {

	private static boolean checkIfValidIpv4(String text){
		   StringTokenizer st = new StringTokenizer(text,".");
		   for(int i = 0; i < 4; i++){ 
		     if(!st.hasMoreTokens()){
		       return false;
		     }
		     int num = Integer.parseInt(st.nextToken());
		     if(num < 0 || num > 255){
		       return false;
		    }
		   }
		   if(st.hasMoreTokens()){
		     return false;
		   }
		   return true;
		}

	public void Boot(String addr, Peer p,int x) throws IOException, InterruptedException{
		System.out.println(checkIfValidIpv4(addr));
		StringTokenizer st = new StringTokenizer(addr,".");
		String sf = null;
		while (st.hasMoreTokens()) 
			sf=st.nextToken();
		int port=Integer.parseInt(sf)+4000; 
	
	// create a peer with a random peerID, on port 4000, listening to the interface eth0
	//*peer.remove(peer.getPeerBean().getPeerMap().getAll().get(0).getID());
	System.out.println(p.getPeerAddress());
	InetAddress address = Inet4Address.getByName(addr);
	FutureDiscover futureDiscover = p.discover().setInetAddress( address ).setPorts( port ).start();
	futureDiscover.awaitUninterruptibly();
	FutureBootstrap futureBootstrap = p.bootstrap().setInetAddress( address ).setPorts( port ).start();
	futureBootstrap.awaitUninterruptibly();
	if (futureBootstrap.isSuccess()){
		p.sendDirect(futureBootstrap.getBootstrapTo().iterator().next()).setObject("this is the message").start();
		}
	/*futureBootstrap.getBootstrapTo()*/
	/*FutureDHT fDHT=p.put(p.getPeerBean().getPeerMap().getAll().get(0).getID()).setData(new Data(addr)).start().awaitUninterruptibly();
	fDHT.awaitUninterruptibly();
	//*InetAddress address1 = Inet4Address.getByName("192.168.85.132");
	//*FutureDiscover futureDiscover1 = peer.discover().setInetAddress( address1 ).setPorts( 4000 ).start();
	//*futureDiscover1.awaitUninterruptibly();
	//*FutureBootstrap futureBootstrap1 = peer.bootstrap().setInetAddress( address1 ).setPorts( 4000 ).start();
	//*futureBootstrap1.awaitUninterruptibly();
	FutureDHT FDHT = p.get(p.getPeerBean().getPeerMap().getAll().get(0).getID()).start();
	FDHT.awaitUninterruptibly();
	System.out.println(FDHT.getDataMap());*/
	RTimHTTP pr=new RTimHTTP();
	
	System.out.println("nombre de machine conectés au master:"+p.getPeerBean().getPeerMap().size());
	System.out.println("les machine qui sont connecté au master:"+p.getPeerBean().getPeerMap().getAll());
	p.setObjectDataReply( new ObjectDataReply()
    {         
        @Override
        public Object reply( PeerAddress sender, Object request )
            throws Exception
        {                    
        	       
        	            long x=10000;
                        String sip = null;
        	             if(request!=null){
 for (int i=0;i<p.getPeerBean().getPeerMap().size();i++){
  if((!p.getPeerBean().getPeerMap().getAll().get(i).getID().toString().equals(sender.getID().toString()))&&(!p.getPeerBean().getPeerMap().getAll().get(i).getID().toString().equals(p.getPeerAddress().getID().toString()))){
        	            		String s11=p.getPeerBean().getPeerMap().getAll().get(i).getInetAddress().toString();
         	            		String s22=s11.substring(1);
        	            		 if (x>pr.Time(s22)){
        	            			 
        	            			 x=pr.Time(s22);
        	            			 sip=s22;
        	            			
        	            			 
        	            		     
        	            		 }
        	            		
        	            		 }
        	            }};
        	             HAProxyController hp=new HAProxyController();
           	     		 hp.update(sip);
           	     		 
	            	    	p.sendDirect(sender).setObject(sip).start();
	            	    	System.out.println(p.getPeerBean().getPeerMap().getAll());
	            	    	 
        	             
                     return sip;
        }
    } );
	
	
	//*peer.sendDirect(peer.getPeerBean().getPeerMap().getAll().get(1)).setObject("this is the message").start();
}}
