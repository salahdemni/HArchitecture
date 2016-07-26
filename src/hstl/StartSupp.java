package hstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import net.tomp2p.p2p.Peer;

public class StartSupp extends Application{
	@FXML static Pane VMPan1;
	@FXML static Pane VMPan2;
	@FXML static Pane VMPan3;
	@FXML static Pane VMPan4;
	@FXML static Pane VMPan5;
	@FXML static Pane VMPan6;
	@FXML static Button b1;
	@FXML static Button b2;
	@FXML static Button b3;
	@FXML static Button b4;
	@FXML static Button b5;
	@FXML static Button b6;
	@FXML Button bconf;
	@FXML Button bann;
	static Peer p;
	static String extIP;
	static List<String> f1 = new ArrayList<String>();
	static int ind;
	public void start(Stage st)throws Exception{
		try
		{Parent root=FXMLLoader.load(getClass().getResource("InterfaceSupp.fxml"));
		st.setResizable(false);
		st.setTitle("Suppression");
		Scene scene= new Scene(root);
		st.setScene(scene);
		st.show();

	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	public void closeButtonAction()throws Exception,IOException{
	    // get a handle to the stage
	    Stage stage = (Stage) bconf.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
	public void extIP(String extIP,Peer p,List f1,Pane VMPan1,Pane VMPan2,Pane VMPan3,Pane VMPan4,Pane VMPan5,Pane VMPan6,
			          Button b1,Button b2,Button b3,Button b4,Button b5,Button b6){
		this.extIP=extIP;
		this.p=p;
		this.f1=f1;
		this.VMPan1=VMPan1;
		this.VMPan2=VMPan2;
		this.VMPan3=VMPan3;
		this.VMPan4=VMPan4;
		this.VMPan5=VMPan5;
		this.VMPan6=VMPan6;
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
		this.b4=b4;
		this.b5=b5;
		this.b6=b6;
	}
	public void SuppVM(ActionEvent event) throws Exception{
		System.out.println(f1.size());
		for (int i=0;i<p.getPeerBean().getPeerMap().size();i++){
	      	if(p.getPeerBean().getPeer().getPeerAddress().toString().equals(extIP)){
	      		System.out.println(p.getPeerBean().getPeer().getPeerAddress().toString());
	      		p.getPeerBean().getPeer().shutdown();
	      	}}
		for(String elem: f1){
			System.out.println(elem);
			if(elem.equals(extIP)){
			ind=f1.indexOf(elem);
			}
		}
		Iterator<String> iter = f1.iterator();
		while(iter.hasNext()){
			String str = iter.next();
		      if( str.equals(extIP) )
		      {
		        iter.remove();
		      }
		}
		if(extIP.equals(b1.getText())){
			VMPan1.setVisible(false);
		}
		if(extIP.equals(b2.getText())){
			VMPan2.setVisible(false);
		}
		if(extIP.equals(b3.getText())){
			VMPan3.setVisible(false);
		}
		if(extIP.equals(b4.getText())){
			VMPan4.setVisible(false);
		}
		if(extIP.equals(b5.getText())){
			VMPan5.setVisible(false);
		}
		if(extIP.equals(b6.getText())){
			VMPan6.setVisible(false);
		}
		/*for(String elem: f1){
			System.out.println(elem);
			/*if(elem.equals(extIP)){
				System.out.println(elem);
			f1.remove(f1.indexOf(elem));
			}
		}*/
		System.out.println(p.getPeerBean().getPeerMap().getAll());
		 Stage stage = (Stage) bann.getScene().getWindow();
		    // do what you have to do
		    stage.close();
	   }
	
	public static void main(String[] arg ){
		launch(arg);
	}
}
