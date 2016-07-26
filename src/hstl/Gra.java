package hstl;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.event.ActionEvent;
import javafx.scene.chart.XYChart;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Gra extends Application{
	@FXML LineChart <String , Number> LineChart;
	static double d1,d2,d3,d4,d5;
	public void start(Stage st)throws Exception{
		try
		{Parent root=FXMLLoader.load(getClass().getResource("Graph.fxml"));
		st.setResizable(false);
		st.setTitle("Graph");
		Scene scene= new Scene(root);
		st.setScene(scene);
		st.show();

	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	@SuppressWarnings("static-access")
	public void set(double d1,double d2 ,double d3 ,double d4 ,double d5){
		this.d1=d1;
		this.d2=d2;
		this.d3=d3;
		this.d4=d4;
		this.d5=d5;
	}
	
public void btn (ActionEvent event) throws Exception,IOException{
	    System.out.println(d1);
	    System.out.println(d2);
	    System.out.println(d3);
	    System.out.println(d4);
	    System.out.println(d5);
		LineChart.getData().clear();
		XYChart.Series<String, Number> series= new XYChart.Series<String , Number>();
		series.getData().add(new XYChart.Data<String , Number>("M1", d1));
		series.getData().add(new XYChart.Data<String , Number>("M2", d2));
		series.getData().add(new XYChart.Data<String , Number>("M3", d3));
		series.getData().add(new XYChart.Data<String , Number>("M4", d4));
		series.getData().add(new XYChart.Data<String , Number>("5 Minute", d5));
		/*series.getData().add(new XYChart.Data<String , Number>("J5", 99.947));
		series.getData().add(new XYChart.Data<String , Number>("J6", 99.923));
		series.getData().add(new XYChart.Data<String , Number>("J7", 99.900));
		series.getData().add(new XYChart.Data<String , Number>("J8", 99.834));
		series.getData().add(new XYChart.Data<String , Number>("J9", 99.800));
		series.getData().add(new XYChart.Data<String , Number>("J10", 99.764));
		series.getData().add(new XYChart.Data<String , Number>("J11", 99.622));
		series.getData().add(new XYChart.Data<String , Number>("J12", 99.567));
		series.getData().add(new XYChart.Data<String , Number>("J13", 98.020));
		series.getData().add(new XYChart.Data<String , Number>("J14", 97.567));
		series.getData().add(new XYChart.Data<String , Number>("J15", 96.000));
		series.getData().add(new XYChart.Data<String , Number>("J16", 95.987));
		series.getData().add(new XYChart.Data<String , Number>("J17", 95.876));
		series.getData().add(new XYChart.Data<String , Number>("J18", 95.654));
		series.getData().add(new XYChart.Data<String , Number>("J19", 95.342));
		series.getData().add(new XYChart.Data<String , Number>("J20", 95.254));
		series.getData().add(new XYChart.Data<String , Number>("J21", 95.153));
		series.getData().add(new XYChart.Data<String , Number>("J22", 95.009));
		series.getData().add(new XYChart.Data<String , Number>("J23", 94.994));
		series.getData().add(new XYChart.Data<String , Number>("J24", 94.900));
		series.getData().add(new XYChart.Data<String , Number>("J25", 94.895));
		series.getData().add(new XYChart.Data<String , Number>("J26", 95.870));
		series.getData().add(new XYChart.Data<String , Number>("J27", 95.830));
		series.getData().add(new XYChart.Data<String , Number>("J28", 95.762));
		series.getData().add(new XYChart.Data<String , Number>("J29", 95.000));
		
		XYChart.Series<String, Number> series1= new XYChart.Series<String , Number>();
		series1.getData().add(new XYChart.Data<String , Number>("J0", 99.0));
		series1.getData().add(new XYChart.Data<String , Number>("J1", 90.999));
		series1.getData().add(new XYChart.Data<String , Number>("J2", 80.989));
		series1.getData().add(new XYChart.Data<String , Number>("J3", 82.974));
		series1.getData().add(new XYChart.Data<String , Number>("J4", 83.950));
		series1.getData().add(new XYChart.Data<String , Number>("J5", 79.947));
		series1.getData().add(new XYChart.Data<String , Number>("J6", 87.923));
		series1.getData().add(new XYChart.Data<String , Number>("J7", 75.900));
		series1.getData().add(new XYChart.Data<String , Number>("J8", 72.834));
		series1.getData().add(new XYChart.Data<String , Number>("J9", 65.800));
		series1.getData().add(new XYChart.Data<String , Number>("J10", 69.764));
		series1.getData().add(new XYChart.Data<String , Number>("J11", 65.622));
		series1.getData().add(new XYChart.Data<String , Number>("J12", 66.567));
		series1.getData().add(new XYChart.Data<String , Number>("J13", 63.020));
		series1.getData().add(new XYChart.Data<String , Number>("J14", 62.567));
		series1.getData().add(new XYChart.Data<String , Number>("J15", 60.000));
		series1.getData().add(new XYChart.Data<String , Number>("J16", 59.987));
		series1.getData().add(new XYChart.Data<String , Number>("J17", 58.876));
		series1.getData().add(new XYChart.Data<String , Number>("J18", 55.654));
		series1.getData().add(new XYChart.Data<String , Number>("J19", 45.342));
		series1.getData().add(new XYChart.Data<String , Number>("J20", 49.254));
		series1.getData().add(new XYChart.Data<String , Number>("J21", 40.153));
		series1.getData().add(new XYChart.Data<String , Number>("J22", 35.009));
		series1.getData().add(new XYChart.Data<String , Number>("J23", 30.994));
		series1.getData().add(new XYChart.Data<String , Number>("J24", 29.900));
		series1.getData().add(new XYChart.Data<String , Number>("J25", 25.895));
		series1.getData().add(new XYChart.Data<String , Number>("J26", 25.870));
		series1.getData().add(new XYChart.Data<String , Number>("J27", 20.830));
		series1.getData().add(new XYChart.Data<String , Number>("J28", 15.762));
		series1.getData().add(new XYChart.Data<String , Number>("J29", 10.000));
		
		XYChart.Series<String, Number> series2= new XYChart.Series<String , Number>();
		series2.getData().add(new XYChart.Data<String , Number>("J0", 99.900));
		series2.getData().add(new XYChart.Data<String , Number>("J1", 97.999));
		series2.getData().add(new XYChart.Data<String , Number>("J2", 96.989));
		series2.getData().add(new XYChart.Data<String , Number>("J3", 95.974));
		series2.getData().add(new XYChart.Data<String , Number>("J4", 94.950));
		series2.getData().add(new XYChart.Data<String , Number>("J5", 93.947));
		series2.getData().add(new XYChart.Data<String , Number>("J6", 92.923));
		series2.getData().add(new XYChart.Data<String , Number>("J7", 90.900));
		series2.getData().add(new XYChart.Data<String , Number>("J8", 89.834));
		series2.getData().add(new XYChart.Data<String , Number>("J9", 88.800));
		series2.getData().add(new XYChart.Data<String , Number>("J10", 87.764));
		series2.getData().add(new XYChart.Data<String , Number>("J11", 86.622));
		series2.getData().add(new XYChart.Data<String , Number>("J12", 85.567));
		series2.getData().add(new XYChart.Data<String , Number>("J13", 84.020));
		series2.getData().add(new XYChart.Data<String , Number>("J14", 83.567));
		series2.getData().add(new XYChart.Data<String , Number>("J15", 82.000));
		series2.getData().add(new XYChart.Data<String , Number>("J16", 81.987));
		series2.getData().add(new XYChart.Data<String , Number>("J17", 80.876));
		series2.getData().add(new XYChart.Data<String , Number>("J18", 79.654));
		series2.getData().add(new XYChart.Data<String , Number>("J19", 78.342));
		series2.getData().add(new XYChart.Data<String , Number>("J20", 77.254));
		series2.getData().add(new XYChart.Data<String , Number>("J21", 76.153));
		series2.getData().add(new XYChart.Data<String , Number>("J22", 75.009));
		series2.getData().add(new XYChart.Data<String , Number>("J23", 74.994));
		series2.getData().add(new XYChart.Data<String , Number>("J24", 73.900));
		series2.getData().add(new XYChart.Data<String , Number>("J25", 72.895));
		series2.getData().add(new XYChart.Data<String , Number>("J26", 71.870));
		series2.getData().add(new XYChart.Data<String , Number>("J27", 70.830));
		series2.getData().add(new XYChart.Data<String , Number>("J28", 69.762));
		series2.getData().add(new XYChart.Data<String , Number>("J29", 20.000));*/
        series.setName("VM");
		/*series2.setName("VM3");
        series1.setName("VM2");*/
        LineChart.getData().add(series);
        /*LineChart.getData().add(series1);
        LineChart.getData().add(series2);*/
		}
public static void main(String[] arg ){
	launch(arg);
}


}

