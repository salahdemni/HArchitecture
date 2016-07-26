package hstl;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.URI;

import javax.swing.event.ChangeEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Client extends Application{
	@FXML 
	TitledPane S1;
	private TabPane T1;
	private AnchorPane L1;
	private Tab Lancer;
	public void start(Stage st)throws Exception{
		try
		{Parent root=FXMLLoader.load(getClass().getResource("ClientInterface.fxml"));
		st.setResizable(false);
		st.setTitle("Client Peer");
		Scene scene= new Scene(root);
		st.setScene(scene);
		st.show();

	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	public void action(ActionEvent event) throws Exception,IOException, InterruptedException{
		System.out.println("Launch Browser");
		PeerClientInst pci=new PeerClientInst();
		//*pci.ReturnIP();
		}
	public static void main(String[] arg ){
		launch(arg);
	}
}
