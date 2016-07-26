package hstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import net.tomp2p.connection.Bindings;
import net.tomp2p.p2p.Peer;
import net.tomp2p.p2p.PeerMaker;
import net.tomp2p.peers.Number160;
import net.tomp2p.peers.PeerAddress;
import net.tomp2p.rpc.ObjectDataReply;

public class Master extends Application{
	@FXML
	private TextField IPtf;
	@FXML
	Button AJButton;
	@FXML
	Pane VMPan1;
	@FXML
	Pane VMPan2;
	@FXML
	Pane VMPan3;
	@FXML
	Pane VMPan4;
	@FXML
	Pane VMPan5;
	@FXML
	Pane VMPan6;
	@FXML
	Button b1;
	@FXML
	Button b2;
	@FXML
	Button b3;
	@FXML
	Button b4;
	@FXML
	Button b5;
	@FXML
	Button b6;
	@FXML
	ImageView img1;
	@FXML
	ImageView img2;
	@FXML
	ImageView img3;
	@FXML
	ImageView img4;
	@FXML
	ImageView img5;
	@FXML
	ImageView img6;
	static Peer p;
	static int x=0;
	static String ip="";
	static Integer tab[]=new Integer[10];
	static long tab1[]=new long[10];
	static List<String> f1 = new ArrayList<String>();
	static int stat1=0,stat2=0,stat3=0,stat4=0,stat5=0,stat6=0;
	static int nbp1=0,nbp2=0,nbp3=0,nbp4=0,nbp5=0,nbp6=0;
	static int nbpr1=0,nbpr2=0,nbpr3=0,nbpr4=0,nbpr5=0,nbpr6=0;
	static int tbf1=0,tbf2=0,tbf3=0,tbf4=0,tbf5=0,tbf6=0;
	static int tdr1=0,tdr2=0,tdr3=0,tdr4=0,tdr5=0,tdr6=0;
	static int i=0;
	static int tm1,tm2,tm3,tm4,tm5,tm6;
	static double d1=0,d2=0,d3=0,d4=0,d5=0;
	static double d11=0,d12=0,d13=0,d14=0,d15=0;
	static double d21=0,d22=0,d23=0,d24=0,d25=0;
	static double d31=0,d32=0,d33=0,d34=0,d35=0;
	static double d41=0,d42=0,d43=0,d44=0,d45=0;
	static double d51=0,d52=0,d53=0,d54=0,d55=0;
	static long httpr1,httpr2,httpr3,httpr4,httpr5,httpr6;
	static long execTime=0;
	static int df;
	static int val1=-1;
	static int val2=-1;
	static int val3=-1;
	static int val4=-1;
	static int val5=-1;
	Statistic_Total stol=new Statistic_Total();
	public void start(Stage st)throws Exception{
		try
	{
		Parent root=FXMLLoader.load(getClass().getResource("InterfaceIP.fxml"));
		st.setTitle("Master Peer");
		st.setResizable(false);
		Scene scene= new Scene(root);
		st.setScene(scene);
		st.show();	
		Random r = new Random();
		Bindings b = new Bindings();
		// create a peer with a random peerID, on port 4000, listening to the interface eth0
		p = new PeerMaker(new Number160(r)).setPorts(4000).setBindings(b).makeAndListen();
		p.getConfiguration().setBehindFirewall(true);
		RTimHTTP pr0=new RTimHTTP();
		Runnable helloRunnable = new Runnable() {
			
		    public void run() {
		    	execTime++;
		    	for(String elem: f1)
			    { i=f1.indexOf(elem);
			    	 /*System.out.println (elem);
			    	 System.out.println (i);*/
		        	if(!elem.equals(p.getPeerAddress().getID().toString())){
		        		//*p.sendDirect(p.getPeerBean().getPeerMap().getAll().get(i)).setObject("alive").start();
		        		if(i==0){
		        			tm1++;
		        			}
           				if(i==1){
           					tm2++;
           					}
           				if(i==2){
           					tm3++;}
           				if(i==3){
           					tm4++;}
           				if(i==4){
           					tm5++;}
           				if(i==5){
 	           		    	tm6++;}
 	            		try {
 	            			if(pr0.Time(elem)!=5000){
 	           		    	
 	            				if(i==0){
 	 	            				   tbf1++;}
 	 	            				if(i==1){
 	 	 	            				tbf2++;}
 	 	            				if(i==2){
 	 	 	            				tbf3++;}
 	 	            				if(i==3){
 	 	 	            				tbf4++;}
 	 	            				if(i==4){
 	 	 	            				tbf5++;}
 	 	            				if(i==5){
 	 	 	            				tbf6++;}
 	            			}
 	            			if(pr0.Time(elem)==5000){
 	            			tm1++;
 	           		    	System.out.println(tm1);
 	           		    	tm2++;
 	           		    	tm3++;
 	           		    	tm4++;
 	           		    	tm5++;
 	           		    	tm6++;
 	            				if(i==0){
 	            				stat1++;}
 	            				if(i==1){
 	 	            				stat2++;}
 	            				if(i==2){
 	 	            				stat3++;}
 	            				if(i==3){
 	 	            				stat4++;}
 	            				if(i==4){
 	 	            				stat5++;}
 	            				if(i==5){
 	 	            				stat6++;}
 	            			}
 	            			if(pr0.Time(elem)!=5000){
 	            				if(i==0&&stat1!=0){
 	            					tdr1=tdr1+stat1;
 	            					nbpr1++;
 	            					nbp1++;
 	            					stat1=0;}
 	            				if(i==1&&stat2!=0){
 	            					tdr2=tdr2+stat2;
 	            					nbpr2++;
 	            					nbp2++;
 	            					stat2=0;}
 	            				if(i==2&&stat3!=0){
 	            					tdr3=tdr3+stat3;
 	            					nbpr3++;
 	            					nbp3++;
 	            					stat3=0;}
 	            				if(i==3&&stat4!=0){
 	            					tdr4=tdr4+stat4;
 	            					nbpr4++;
 	            					nbp4++;
 	            					stat4=0;}
 	            			    if(i==4&&stat5!=0){
 	            			    	tdr5=tdr5+stat5;
 	            			    	nbpr5++;
 	            			    	nbp5++;
 	            			    	stat5=0;}
 	            			   if(i==5&&stat6!=0){
 	            				  tdr6=tdr6+stat6;
 	            				  nbpr6++;
 	            				  nbp6++;
 	            				  stat6=0;}
 	            			}
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        	}
		        }
	            	
		           /* System.out.println("bon fonctionnement:"+tbf1);
		            System.out.println(stat1);
		            System.out.println("reparation:"+tdr1);
	            	System.out.println("nbre probleme:"+nbp1);
	            	System.out.println(stat2);
	            	System.out.println(nbp2);
	            	System.out.println(stat3);
	            	System.out.println(stat4);
	            	System.out.println(stat5);
	            	System.out.println(stat6);*/
		    	
		    	//*machine 1
			    if(tm1==60){
			    	if(nbp1!=0){
			    	double td1=((double)nbp1)/tbf1;
			    	double tr1=((double)nbp1)/tdr1;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d1=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d1=100;}
			    	nbp1=0;
			    }
			    if(tm1==120){
			    	if(nbp1!=0){
			    	double td1=((double)nbp1)/tbf1;
			    	double tr1=((double)nbp1)/tdr1;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d2=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d2=100;}
			    	nbp1=0;
			    }
			    if(tm1==180){
			    	if(nbp1!=0){
			    	double td1=((double)nbp1)/tbf1;
			    	double tr1=((double)nbp1)/tdr1;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d3=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d3=100;}
			    	nbp1=0;
			    }
			    if(tm1==240){
			    	if(nbp1!=0){
			    	double td1=((double)nbp1)/tbf1;
			    	double tr1=((double)nbp1)/tdr1;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d4=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d4=100;}
			    	nbp1=0;
			    }
			    if(tm1==300){
			    	if(nbp1!=0){
			    	double td1=((double)nbp1)/tbf1;
			    	double tr1=((double)nbp1)/tdr1;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d5=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d5=100;}
			    	nbp1=0;
			    }
			    //*Machine 2
			    if(tm2==60){
			    	if(nbp2!=0){
			    	double td1=((double)nbp2)/tbf2;
			    	double tr1=((double)nbp2)/tdr2;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d11=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d11=100;}
			    	nbp2=0;
			    }
			    if(tm2==120){
			    	if(nbp2!=0){
			    	double td1=((double)nbp2)/tbf2;
			    	double tr1=((double)nbp2)/tdr2;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d12=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d12=100;}
			    	nbp2=0;
			    }
			    if(tm2==180){
			    	if(nbp2!=0){
			    	double td1=((double)nbp2)/tbf2;
			    	double tr1=((double)nbp2)/tdr2;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d13=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d13=100;}
			    	nbp2=0;
			    }
			    if(tm2==240){
			    	if(nbp2!=0){
			    	double td1=((double)nbp2)/tbf2;
			    	double tr1=((double)nbp2)/tdr2;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d14=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d14=100;}
			    	nbp2=0;
			    }
			    if(tm2==300){
			    	if(nbp2!=0){
			    	double td1=((double)nbp2)/tbf2;
			    	double tr1=((double)nbp2)/tdr2;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d15=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d15=100;}
			    	nbp2=0;
			    }
			    //*Machine 3
			    if(tm3==60){
			    	if(nbp3!=0){
			    	double td1=((double)nbp3)/tbf3;
			    	double tr1=((double)nbp3)/tdr3;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d21=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d21=100;}
			    	nbp3=0;
			    }
			    if(tm3==120){
			    	if(nbp3!=0){
			    	double td1=((double)nbp3)/tbf3;
			    	double tr1=((double)nbp1)/tdr3;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d22=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d22=100;}
			    	nbp3=0;
			    }
			    if(tm3==180){
			    	if(nbp3!=0){
			    	double td1=((double)nbp3)/tbf3;
			    	double tr1=((double)nbp1)/tdr3;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d23=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d23=100;}
			    	nbp3=0;
			    }
			    if(tm3==240){
			    	if(nbp3!=0){
			    	double td1=((double)nbp3)/tbf3;
			    	double tr1=((double)nbp3)/tdr3;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d24=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d24=100;}
			    	nbp3=0;
			    }
			    if(tm3==300){
			    	if(nbp3!=0){
			    	double td1=((double)nbp3)/tbf3;
			    	double tr1=((double)nbp3)/tdr3;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d25=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d25=100;}
			    	nbp3=0;
			    }
			    //*Machine 4
			    if(tm4==60){
			    	if(nbp4!=0){
			    	double td1=((double)nbp4)/tbf4;
			    	double tr1=((double)nbp4)/tdr4;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d31=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d31=100;}
			    	nbp4=0;
			    }
			    if(tm4==120){
			    	if(nbp4!=0){
			    	double td1=((double)nbp4)/tbf4;
			    	double tr1=((double)nbp4)/tdr4;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d32=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d32=100;}
			    	nbp4=0;
			    }
			    if(tm4==180){
			    	if(nbp4!=0){
			    	double td1=((double)nbp4)/tbf4;
			    	double tr1=((double)nbp4)/tdr4;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d33=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d33=100;}
			    	nbp4=0;
			    }
			    if(tm4==240){
			    	if(nbp4!=0){
			    	double td1=((double)nbp4)/tbf4;
			    	double tr1=((double)nbp4)/tdr4;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d34=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d34=100;}
			    	nbp4=0;
			    }
			    if(tm4==300){
			    	if(nbp4!=0){
			    	double td1=((double)nbp4)/tbf4;
			    	double tr1=((double)nbp4)/tdr4;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d35=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d35=100;}
			    	nbp4=0;
			    }
			    //*Machine 5
			    if(tm5==60){
			    	if(nbp5!=0){
			    	double td1=((double)nbp5)/tbf5;
			    	double tr1=((double)nbp5)/tdr5;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d41=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d41=100;}
			    	nbp5=0;
			    }
			    if(tm5==120){
			    	if(nbp5!=0){
			    	double td1=((double)nbp5)/tbf5;
			    	double tr1=((double)nbp5)/tdr5;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d42=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d42=100;}
			    	nbp5=0;
			    }
			    if(tm5==180){
			    	if(nbp5!=0){
			    	double td1=((double)nbp5)/tbf5;
			    	double tr1=((double)nbp5)/tdr5;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d43=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d43=100;}
			    	nbp5=0;
			    }
			    if(tm5==240){
			    	if(nbp5!=0){
			    	double td1=((double)nbp5)/tbf5;
			    	double tr1=((double)nbp5)/tdr5;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d44=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d44=100;}
			    	nbp5=0;
			    }
			    if(tm5==300){
			    	if(nbp5!=0){
			    	double td1=((double)nbp5)/tbf5;
			    	double tr1=((double)nbp5)/tdr5;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d45=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d45=100;}
			    	nbp5=0;
			    }
			    //*Machine 6
			    if(tm6==60){
			    	if(nbp6!=0){
			    	double td1=((double)nbp6)/tbf6;
			    	double tr1=((double)nbp6)/tdr6;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d51=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d51=100;}
			    	nbp6=0;
			    }
			    if(tm6==120){
			    	if(nbp6!=0){
			    	double td1=((double)nbp6)/tbf6;
			    	double tr1=((double)nbp6)/tdr6;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d52=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d52=100;}
			    	nbp6=0;
			    }
			    if(tm6==180){
			    	if(nbp6!=0){
			    	double td1=((double)nbp6)/tbf6;
			    	double tr1=((double)nbp6)/tdr6;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d53=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d53=100;}
			    	nbp6=0;
			    }
			    if(tm6==240){
			    	if(nbp6!=0){
			    	double td1=((double)nbp6)/tbf6;
			    	double tr1=((double)nbp6)/tdr6;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d54=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d54=100;}
			    	nbp6=0;
			    }
			    if(tm6==300){
			    	if(nbp6!=0){
			    	double td1=((double)nbp6)/tbf6;
			    	double tr1=((double)nbp6)/tdr6;
			    	double MTBF1=1/td1;
				    double MTTR1=1/tr1;
				    d55=(MTBF1/(MTBF1+MTTR1))*100;}
			    	else{d55=100;}
			    	nbp6=0;
			    }
		    }
		};
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(helloRunnable, 0, 1, TimeUnit.SECONDS);
		
	} catch(Exception e) {
		e.printStackTrace();
	}
		
	}
	
	public void actionMaster(MouseEvent event) throws Exception{
		Statistic_Total sto=new Statistic_Total();
		Stage sg=new Stage();
		sto.set1(d1, d2, d3, d4, d5, 
				d11, d12, d13, d14, d15, 
				d21, d22, d23, d24, d25, 
				d31, d32, d33, d34, d35, 
				d41, d42, d43, d44, d45, 
				d51, d52, d53, d54, d55);
		sto.start(sg);
	}
	public void actionSlave1(MouseEvent event) throws Exception{
		StartSupp strs1=new StartSupp();
		Stage sg1=new Stage();
		strs1.start(sg1);
		StartSupp sts=new StartSupp();
		sts.extIP(b1.getText(),p,f1,VMPan1,VMPan2,VMPan3,VMPan4,VMPan5,VMPan6,b1,b2,b3,b4,b5,b6);
	}
	public void actionSlave2(MouseEvent event) throws Exception{
		StartSupp strs2=new StartSupp();
		Stage sg2=new Stage();
		strs2.start(sg2);
		StartSupp sts=new StartSupp();
		sts.extIP(b2.getText(),p,f1,VMPan1,VMPan2,VMPan3,VMPan4,VMPan5,VMPan6,b1,b2,b3,b4,b5,b6);
	}
	public void actionSlave3(MouseEvent event) throws Exception{
		StartSupp strs3=new StartSupp();
		Stage sg3=new Stage();
		strs3.start(sg3);
		StartSupp sts=new StartSupp();
		sts.extIP(b3.getText(),p,f1,VMPan1,VMPan2,VMPan3,VMPan4,VMPan5,VMPan6,b1,b2,b3,b4,b5,b6);
	}
	public void actionSlave4(MouseEvent event) throws Exception{
		StartSupp strs4=new StartSupp();
		Stage sg4=new Stage();
		strs4.start(sg4);
		StartSupp sts=new StartSupp();
		sts.extIP(b4.getText(),p,f1,VMPan1,VMPan2,VMPan3,VMPan4,VMPan5,VMPan6,b1,b2,b3,b4,b5,b6);
	}
	public void actionSlave5(MouseEvent event) throws Exception{
		StartSupp strs5=new StartSupp();
		Stage sg5=new Stage();
		strs5.start(sg5);
		StartSupp sts=new StartSupp();
		sts.extIP(b5.getText(),p,f1,VMPan1,VMPan2,VMPan3,VMPan4,VMPan5,VMPan6,b1,b2,b3,b4,b5,b6);
	}
	public void actionSlave6(MouseEvent event) throws Exception{
		StartSupp strs6=new StartSupp();
		Stage sg6=new Stage();
		strs6.start(sg6);
		StartSupp sts=new StartSupp();
		sts.extIP(b6.getText(),p,f1,VMPan1,VMPan2,VMPan3,VMPan4,VMPan5,VMPan6,b1,b2,b3,b4,b5,b6);
	}
	public void actionVM1(ActionEvent event) throws Exception{
		    Dis m=new Dis();
		    Stage st=new Stage();
		    double td=0;
		    double tr=0;
		    double dis=0;
		    double MTBF;
		    double MTTR;
		    if(nbpr1!=0){
		    
		    	td=((double)nbpr1)/tbf1;
		    	tr=((double)nbpr1)/tdr1;
		    	MTBF=1/td;
			    MTTR=1/tr;
			    dis=(MTBF/(MTBF+MTTR))*100;
		    }
		    else{
		    	dis=100;
		    }
		    m.set(p.getP2PID(), nbpr1, tbf1, tdr1, td, tr, dis);
		    m.start(st);
		    m.setdis(d1, d2, d3, d4, d5);
		    
	}
    public void actionVM2(ActionEvent event) throws Exception{
    	    Dis m1=new Dis();
		    Stage st1=new Stage();
		    double td1=0;
		    double tr1=0;
		    double dis1=0;
		    double MTBF1;
		    double MTTR1;
		    if(nbpr2!=0){
		    	td1=((double)nbpr2)/tbf2;
		    	tr1=((double)nbpr2)/tdr2;
		    	MTBF1=1/td1;
			    MTTR1=1/tr1;
			    dis1=(MTBF1/(MTBF1+MTTR1))*100;
		    }
		    else{
		    	dis1=100;
		    }
		    
		    m1.set(p.getP2PID(), nbpr2, tbf2, tdr2, td1, tr1, dis1);
		    m1.start(st1);
		    m1.setdis(d11, d12, d13, d14, d15);
	}
    public void actionVM3(ActionEvent event) throws Exception{
    	 Dis m2=new Dis();
		    Stage st2=new Stage();
		    double td2=0;
		    double tr2=0;
		    double dis2=0;
		    double MTBF2;
		    double MTTR2;
		    if(nbpr3!=0){
		    	
		    	td2=((double)nbpr3)/tbf3;
		    	tr2=((double)nbpr3)/tdr3;
		    	MTBF2=1/td2;
			    MTTR2=1/tr2;
			    dis2=(MTBF2/(MTBF2+MTTR2))*100;
		    }
		    else{
		    	dis2=100;
		    }
		    
		    m2.set(p.getP2PID(), nbpr3, tbf3, tdr3, td2, tr2, dis2);
		    m2.start(st2);
		    m2.setdis(d21, d22, d23, d24, d25);
	}
    public void actionVM4(ActionEvent event) throws Exception{
    	 Dis m3=new Dis();
		    Stage st3=new Stage();
		    double td3=0;
		    double tr3=0;
		    double dis3=0;
		    double MTBF3;
		    double MTTR3;
		    if(nbpr4!=0){
		    
		    	td3=((double)nbpr4)/tbf4;
		    	tr3=((double)nbpr4)/tdr4;
		    	MTBF3=1/td3;
			    MTTR3=1/tr3;
			    dis3=(MTBF3/(MTBF3+MTTR3))*100;
		    }
		    else{
		    	dis3=100;
		    }
		    
		    m3.set(p.getP2PID(), nbpr4, tbf4, tdr4, td3, tr3, dis3);
		    m3.start(st3);
		    m3.setdis(d31, d32, d33, d34, d35);
	}
    public void actionVM5(ActionEvent event) throws Exception{
    	 Dis m4=new Dis();
		    Stage st4=new Stage();
		    double td4=0;
		    double tr4=0;
		    double dis4=0;
		    double MTBF4;
		    double MTTR4;
		    if(nbpr5!=0){
		    	
		    	td4=((double)nbpr5)/tbf5;
		    	tr4=((double)nbpr5)/tdr5;
		    	MTBF4=1/td4;
			    MTTR4=1/tr4;
			    dis4=(MTBF4/(MTBF4+MTTR4))*100;
		    }
		    else{
		    	dis4=100;
		    }
		    
		    m4.set(p.getP2PID(), nbpr5, tbf5, tdr5, td4, tr4, dis4);
		    m4.start(st4);
		    m4.setdis(d41, d42, d43, d44, d45);
	}
    public void actionVM6(ActionEvent event) throws Exception {
    	    Dis m5=new Dis();
		    Stage st5=new Stage();
		    double td5=0;
		    double tr5=0;
		    double dis5=0;
		    double MTBF5;
		    double MTTR5;
		    if(nbpr6!=0){
		    	td5=((double)nbpr6)/tbf6;
		    	tr5=((double)nbpr6)/tdr6;
		    	MTBF5=1/td5;
			    MTTR5=1/tr5;
			    dis5=(MTBF5/(MTBF5+MTTR5))*100;
		    }
		    else{
		    	dis5=100;
		    }
		    
		    m5.set(p.getP2PID(), nbpr6, tbf6, tdr6, td5, tr5, dis5);
		    m5.start(st5);
		    m5.setdis(d51, d52, d53, d54, d55);
	}
	public void action(ActionEvent event) throws IOException, InterruptedException{
		Request r=new Request();
		r.Boot(f1,IPtf.getText().toString(),p,x);
		RTimHTTP pr=new RTimHTTP();
		if(f1.size()==1){
			VMPan1.setVisible(true);
			b1.setText(IPtf.getText());
			}
			if(f1.size()==2){
			VMPan2.setVisible(true);
			b2.setText(IPtf.getText());}
			if(f1.size()==3){
			VMPan3.setVisible(true);
			b3.setText(IPtf.getText());}
			if(f1.size()==4){
			VMPan4.setVisible(true);
			b4.setText(IPtf.getText());}
			if(f1.size()==5){
				VMPan6.setVisible(true);
				b6.setText(IPtf.getText());}
			if(f1.size()==6){
				VMPan5.setVisible(true);
				b5.setText(IPtf.getText());}
			  Runnable helloRunnable1 = new Runnable() {
      			
      		    public void run() {
      		    	
      for (int i=0;i<p.getPeerBean().getPeerMap().size();i++){
      	p.sendDirect(p.getPeerBean().getPeerMap().getAll().get(i)).setObject("reachable").start();}
      		    }};
			 ScheduledExecutorService executor1 = Executors.newScheduledThreadPool(1);
             executor1.scheduleAtFixedRate(helloRunnable1, 0, 10, TimeUnit.SECONDS);
		p.setObjectDataReply( new ObjectDataReply()
	    {         
	        @Override
	        public Object reply( PeerAddress sender, Object request )
	            throws Exception
	        {                    
	        	                       
	        	            long x=10000;
	                        String sip = null;
	                        int hg=0;
	                      
	                		    
	                		   
	                        /*if(!request.equals("msg")){
	                        	for(int kj=p.getPeerBean().getPeerMap().size()-1;kj<tab.length;kj++){
	                        		if(request!=null){
	                        			tab[kj]=Integer.parseInt(request.toString());
	                        		}
	                        	}}*/
	                        if(!request.equals("msg")){
	                       		for(String elem: f1){
	                        			
	                     String s33=sender.getInetAddress().toString().substring(1, sender.getInetAddress().toString().length());
	                        			if(s33.equals(elem)){  			
	                        		if(request!=null){
	                        			tab[f1.indexOf(elem)]=Integer.parseInt(request.toString());
	                        		}}}
	                        	}
	                       
	        	             if(request.equals("msg")){
	        	            	 
	        	            		for(String elem: f1)
	        	    			    { hg=f1.indexOf(elem);
	        	    			    	/* System.out.println (elem);
	        	    			    	 System.out.println (hg);*/
	        	   if((!elem.equals(p.getPeerAddress().getID().toString()))&&(!elem.equals(sender.getID().toString()))){
	        	            	
	         	            		System.out.println("Sending Http Request to " + elem);
	         	            	    long xy=pr.Time(elem);
	         	            	    System.out.println(xy);
	         	            	    if(hg==0){
	         	            	    	httpr1=xy;
	         	            	    }
	         	            	   if(hg==1){
	         	            	    	httpr2=xy;
	         	            	    }
	         	            	   if(hg==2){
	         	            	    	httpr3=xy;
	         	            	    }
	         	            	   if(hg==3){
	         	            	    	httpr4=xy;
	         	            	    }
	         	            	   if(hg==4){
	         	            	    	httpr5=xy;
	         	            	    }
	         	            	   if(hg==5){
	         	            	    	httpr6=xy;
	         	            	    }
	         	            	   
								   
	        	            		 if (x>xy){
	        	            			 df=hg;
	        	            			 x=xy;
	        	            			 sip=elem;
	        	            			 for(int l = 0; l < f1.size(); l++) {
	        		                        	System.out.println("nombre de cnx http du peer"+l+":"+ tab[l]);
	        		                        }}
	        	            		 
	        	            		 else if (x==xy){
	        	            			 if(hg==1){
	        	            				 val1=tab[hg];
	        	            			 }
	        	            			 if(hg==2){
	        	            				 val2=tab[hg];
	        	            			 }
	        	            			 if(hg==3){
	        	            				 val3=tab[hg];
	        	            			 }
	        	            			 if(hg==4){
	        	            				 val4=tab[hg];
	        	            			 }
	        	            			 if(hg==5){
	        	            				 val5=tab[hg];
	        	            			 }
	        	            			 for(int l = 0; l < f1.size(); l++) {
	        		                        	System.out.println("nombre de cnx http du peer"+l+":"+ tab[l]);
	        		                        }
	        	            			
	        	            			if(tab[df]>tab[hg]){
	        	            				//*System.out.println("tabi-1="+tab[i-1]);
	        	            				//*System.out.println("tabi="+tab[i]);
	        	            				 x=xy;
		        	            			 sip=elem;
	        	            			}
	        	            			stol.set3(tab, df ,hg,val1,val2,val3,val4,val5);
	        	            		}}
	        	            }HAProxyController hp=new HAProxyController();
	           	     		hp.update(sip);
	           	     		Image im = new Image("file:images/line3.gif");
	           	         	Image im1 = new Image("file:images/lin.jpg");
	           	     		 if (b1.getText().equals(sip))
	           	     		 { img1.setImage(im);img2.setImage(im1); img3.setImage(im1);
	           	     	       img4.setImage(im1);img5.setImage(im1);img6.setImage(im1);
	           	     		 }
	           	     		if (b2.getText().equals(sip))
	           	     		{img1.setImage(im1); img2.setImage(im);img3.setImage(im1);
		           	     	       img4.setImage(im1);img5.setImage(im1);img6.setImage(im1);}
	           	     	    if (b3.getText().equals(sip))
	           	     	    { img1.setImage(im1); img2.setImage(im1);img3.setImage(im);
	           	     	      img4.setImage(im1);img5.setImage(im1);img6.setImage(im1);
	           	     	    }
	           	     	    if (b4.getText().equals(sip))
	           	     	    {    img1.setImage(im1); img2.setImage(im1); img3.setImage(im1);img4.setImage(im);
	           	               	 img5.setImage(im1);img6.setImage(im1);
	           	     	    }
	           	     	    if (b5.getText().equals(sip))
	           	     	    {    img1.setImage(im1); img2.setImage(im1); img3.setImage(im1);img4.setImage(im1);
	           	     	    img5.setImage(im);img6.setImage(im1);
	           	     	    
	           	     	    }
	           	     	    if (b6.getText().equals(sip))
	           	     	    {
         	     	              img6.setImage(im);
         	     	            img1.setImage(im1); img2.setImage(im1); img3.setImage(im1);
         	     	            img4.setImage(im1);
    	           	     	    img5.setImage(im1);}
		            	    	p.sendDirect(sender).setObject(sip).start();
		            	    	System.out.println(p.getPeerBean().getPeerMap().getAll());
		            	    stol.set2(httpr1, httpr2, httpr3, httpr4, httpr5, httpr6, execTime);
		            	    tab1[0]=httpr1;tab1[1]=httpr2;tab1[2]=httpr3;tab1[3]=httpr4;tab1[4]=httpr5;tab1[5]=httpr6;
		            	    
	        	             }
	        	             
	        	             ;
	        	          
	        	            
		            	    	
	                     return "";
	        }
	    } );
		
		
		
		
	}
	public void cancel(ActionEvent event) throws IOException, InterruptedException{
		IPtf.setText("");
     }
    
	public static void main(String[] arg ) throws InterruptedException{
		launch(arg);
	}
	/*public static void main(String []args){
		String ipAddress1 = "192.168.85.129";
       PingRRT pr1=new PingRRT();
       String s1=pr1.RRT(ipAddress1);
       String ipAddress2 = "192.168.85.130";
       PingRRT pr2=new PingRRT();
       String s2=pr2.RRT(ipAddress2);
       System.out.println(s1);
       System.out.println(s2);
	}*/
}
