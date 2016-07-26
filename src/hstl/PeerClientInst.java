package hstl;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.URI;
import java.util.Random;

import net.tomp2p.futures.FutureBootstrap;
import net.tomp2p.futures.FutureDiscover;
import net.tomp2p.p2p.Peer;
import net.tomp2p.p2p.PeerMaker;
import net.tomp2p.peers.Number160;
import net.tomp2p.peers.PeerAddress;
import net.tomp2p.rpc.ObjectDataReply;

public class PeerClientInst {
     public void ReturnIP(int port1) throws IOException, InterruptedException{
    	Random r = new Random();
    	Peer peerClient = new PeerMaker(new Number160(r)).setPorts( port1 ).makeAndListen();
    	peerClient.getConfiguration().setBehindFirewall(true);
    	FutureDiscover fd = peerClient.discover().setInetAddress(Inet4Address.getByName("127.0.0.1")).setPorts( 4000 ).start();
    	fd.awaitUninterruptibly();
    	FutureBootstrap fb = peerClient.bootstrap().setInetAddress(Inet4Address.getByName("127.0.0.1")).setPorts( 4000 ).start();
    	fb.awaitUninterruptibly();
    	System.out.println(peerClient.getPeerBean().getPeerMap().getAll());
    	for (int i=0;i<peerClient.getPeerBean().getPeerMap().size();i++){
    	peerClient.sendDirect(peerClient.getPeerBean().getPeerMap().getAll().get(i)).setObject("msg").start();}
    	peerClient.setObjectDataReply( new ObjectDataReply()
	    {        
			
	        @Override
	        public Object reply( PeerAddress sender, Object request )
	            throws Exception
	        {   if((!request.equals("http"))&&(!request.equals("reachable"))&&(!request.equals("msg"))){             
	            System.out.println(request);
			   }
	           /* if ( Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported( Action.BROWSE ) ) {
				   URI google = new URI("http://localhost");
				   Desktop.getDesktop().browse( google );
				   }*/
	            return "";
	        }
	    } );
    	///*peerClient.removePeerListener(null);
     }
}
