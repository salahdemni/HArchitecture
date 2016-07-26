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
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowTopolgy extends Application{
	@FXML 
	TitledPane S1;
	@FXML
	Pane VMPan1;
	static Button b1;
	private ImageView imgclient;
	private ImageView imgcnx;
	public void start(Stage st)throws Exception{
		try
		{Parent root=FXMLLoader.load(getClass().getResource("Topology.fxml"));
		st.setResizable(false);
		st.setTitle("Topology");
		Scene scene= new Scene(root);
		st.setScene(scene);
		st.show();
		//*b1.setText("salah");
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	 private void initialize() {
	       VMPan1.setVisible(false);
	    }
	 public void action(ActionEvent event) throws IOException, InterruptedException{
			this.initialize();
		}
	public static void main(String[] arg ){
		launch(arg);
	}
}
