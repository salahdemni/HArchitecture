package hstl;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Dis extends Application{
	@FXML
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	static int v1,v2,v3,v4;
	static double v5,v6,v7;
	static double d1,d2,d3,d4,d5;
	public void start(Stage st)throws Exception{
		try
		{Parent root=FXMLLoader.load(getClass().getResource("Dispon.fxml"));
		st.setResizable(false);
		st.setTitle("Dispo");
		Scene scene= new Scene(root);
		st.setScene(scene);
		st.show();

	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	@SuppressWarnings("static-access")
	public void set(int v1,int v2,int v3,int v4,double v5,double v6,double v7){
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
		this.v4=v4;
		this.v5=v5;
		this.v6=v6;
		this.v7=v7;
	}
	@SuppressWarnings("static-access")
	public void setdis(double d1,double d2 ,double d3 ,double d4 ,double d5){
		this.d1=d1;
		this.d2=d2;
		this.d3=d3;
		this.d4=d4;
		this.d5=d5;
	}
	public void btn (ActionEvent event) throws Exception,IOException{
	    tf1.setText(""+v1);
		tf2.setText(""+v2);
		tf3.setText(""+v3);
		tf4.setText(""+v4);
		tf5.setText(""+v5);
		tf6.setText(""+v6);
		tf7.setText(""+v7+"%");
		}
	public void btncourb (ActionEvent event) throws Exception,IOException{
		Gra g=new Gra();
		Stage st=new Stage();
		g.set(d1, d2, d3, d4, d5);
		g.start(st);
	}
	public static void main(String[] arg ){
		
		launch(arg);
	}
}
