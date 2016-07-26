package hstl;

import java.io.IOException;

import hstl.LineChartWithHover.HoveredThresholdNode;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Statistic_Total extends Application{
	@FXML LineChart <String , Number> LineChart;
	@FXML LineChart <Number , Number> LineChart1;
	@FXML Button btnAC1;
	static double a1,a2,a3,a4,a5;
	static double b1,b2,b3,b4,b5;
	static double c1,c2,c3,c4,c5;
	static double d1,d2,d3,d4,d5;
	static double e1,e2,e3,e4,e5;
	static double f1,f2,f3,f4,f5;
	static XYChart.Series<Number, Number> series= new XYChart.Series<Number , Number>();
	static XYChart.Series<Number, Number> series1= new XYChart.Series<Number , Number>();
	static XYChart.Series<Number, Number> series2= new XYChart.Series<Number , Number>();
	static XYChart.Series<Number, Number> series3= new XYChart.Series<Number , Number>();
	static XYChart.Series<Number, Number> series4= new XYChart.Series<Number , Number>();
	static XYChart.Series<Number, Number> series5= new XYChart.Series<Number , Number>();
	static Integer[]tab1;
	static int df;
	static int hg;
	static int xtab1;
	static int xtab2;
	static int xtab3;
	static int xtab4;
	static int xtab5;
	static int xtab6;
	static int val1;
	static int val2;
	static int val3;
	static int val4;
	static int val5;
	public void start(Stage st)throws Exception{
		try
		{Parent root=FXMLLoader.load(getClass().getResource("Statistic.fxml"));
		st.setResizable(false);
		st.setTitle("Statistique");
		Scene scene= new Scene(root);
		st.setScene(scene);
		st.show();

	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	@SuppressWarnings("static-access")
	public void set1(double a1,double a2 ,double a3 ,double a4 ,double a5,
			double b1,double b2 ,double b3 ,double b4 ,double b5,
			double c1,double c2 ,double c3 ,double c4 ,double c5,
			double d1,double d2 ,double d3 ,double d4 ,double d5,
			double e1,double e2 ,double e3 ,double e4 ,double e5,
			double f1,double f2 ,double f3 ,double f4 ,double f5){
		this.a1=a1;this.a2=a2;this.a3=a3;this.a4=a4;this.a5=a5;
		this.b1=b1;this.b2=b2;this.b3=b3;this.b4=b4;this.b5=b5;
		this.c1=c1;this.c2=c2;this.c3=c3;this.c4=c4;this.c5=c5;
		this.d1=d1;this.d2=d2;this.d3=d3;this.d4=d4;this.d5=d5;
		this.e1=e1;this.e2=e2;this.e3=e3;this.e4=e4;this.e5=e5;
		this.f1=f1;this.f2=f2;this.f3=f3;this.f4=f4;this.f5=f5;
	}
	
	public void btn (ActionEvent event) throws Exception,IOException{
		LineChart.getData().clear();
		
		XYChart.Series<String, Number> series= new XYChart.Series<String , Number>();
		series.getData().add(new XYChart.Data<String , Number>("M1", a1));
		series.getData().add(new XYChart.Data<String , Number>("M2", a2));
		series.getData().add(new XYChart.Data<String , Number>("M3", a3));
		series.getData().add(new XYChart.Data<String , Number>("M4", a4));
		series.getData().add(new XYChart.Data<String , Number>("5 Minute", a5));
		
		
		XYChart.Series<String, Number> series1= new XYChart.Series<String , Number>();
		series1.getData().add(new XYChart.Data<String , Number>("M1", b1));
		series1.getData().add(new XYChart.Data<String , Number>("M2", b2));
		series1.getData().add(new XYChart.Data<String , Number>("M3", b3));
		series1.getData().add(new XYChart.Data<String , Number>("M4", b4));
		series1.getData().add(new XYChart.Data<String , Number>("5 Minute", b5));
		
		XYChart.Series<String, Number> series2= new XYChart.Series<String , Number>();
		series2.getData().add(new XYChart.Data<String , Number>("M1", c1));
		series2.getData().add(new XYChart.Data<String , Number>("M2", c2));
		series2.getData().add(new XYChart.Data<String , Number>("M3", c3));
		series2.getData().add(new XYChart.Data<String , Number>("M4", c4));
		series2.getData().add(new XYChart.Data<String , Number>("5 Minute", c5));
		XYChart.Series<String, Number> series3= new XYChart.Series<String , Number>();
		series3.getData().add(new XYChart.Data<String , Number>("M1", d1));
		series3.getData().add(new XYChart.Data<String , Number>("M2", d2));
		series3.getData().add(new XYChart.Data<String , Number>("M3", d3));
		series3.getData().add(new XYChart.Data<String , Number>("M4", d4));
		series3.getData().add(new XYChart.Data<String , Number>("5 Minute", d5));
		XYChart.Series<String, Number> series4= new XYChart.Series<String , Number>();
		series4.getData().add(new XYChart.Data<String , Number>("M1", e1));
		series4.getData().add(new XYChart.Data<String , Number>("M2", e2));
		series4.getData().add(new XYChart.Data<String , Number>("M3", e3));
		series4.getData().add(new XYChart.Data<String , Number>("M4", e4));
		series4.getData().add(new XYChart.Data<String , Number>("5 Minute", e5));
		XYChart.Series<String, Number> series5= new XYChart.Series<String , Number>();
		series5.getData().add(new XYChart.Data<String , Number>("M1", f1));
		series5.getData().add(new XYChart.Data<String , Number>("M2", f2));
		series5.getData().add(new XYChart.Data<String , Number>("M3", f3));
		series5.getData().add(new XYChart.Data<String , Number>("M4", f4));
		series5.getData().add(new XYChart.Data<String , Number>("5 Minute", f5));
		
        series.setName("VM1");
        series1.setName("VM2");
		series2.setName("VM3");
		series3.setName("VM4");
        series4.setName("VM5");
		series5.setName("VM6");
        LineChart.getData().add(series);
        LineChart.getData().add(series1);
        LineChart.getData().add(series2);
        LineChart.getData().add(series3);
        LineChart.getData().add(series4);
        LineChart.getData().add(series5);
		}
	public void set2(long httpr1,long httpr2,long httpr3,long httpr4,long httpr5,long httpr6,long execTime){
		series.getData().add(new XYChart.Data<Number , Number>(execTime, httpr1));
		series1.getData().add(new XYChart.Data<Number , Number>(execTime, httpr2));
		series2.getData().add(new XYChart.Data<Number , Number>(execTime, httpr3));
		series3.getData().add(new XYChart.Data<Number , Number>(execTime, httpr4));
		series4.getData().add(new XYChart.Data<Number , Number>(execTime, httpr5));
		series5.getData().add(new XYChart.Data<Number , Number>(execTime, httpr6));
	}
	@SuppressWarnings("static-access")
	public void set3(Integer[]tab1,int df,int hg,int val1,int val2,int val3,int val4,int val5){
		this.tab1=tab1;
		this.df=df;
		this.hg=hg;
		if(tab1[0]!= null)
		xtab1=tab1[0];
		xtab2=tab1[hg];
		if(tab1[1]!= null)
		xtab3=tab1[1];
		if(tab1[2]!= null)
		xtab4=tab1[2];
		if(tab1[3]!= null)
		xtab5=tab1[3];
		if(tab1[4]!= null)
		xtab6=tab1[4];
		this.val1=val1;
		this.val2=val2;
		this.val3=val3;
		this.val4=val4;
		this.val5=val5;
	}
	public void btn1 (ActionEvent event) throws Exception,IOException{
		LineChart1.getData().clear();
        series.setName("VM1");
        series1.setName("VM2");
		series2.setName("VM3");
		series3.setName("VM4");
        series4.setName("VM5");
		series5.setName("VM6");
		LineChart1.getData().add(series5);
		LineChart1.getData().add(series4);
		LineChart1.getData().add(series3);
		LineChart1.getData().add(series2);
		LineChart1.getData().add(series1);
        LineChart1.getData().add(series);
        btnAC1.setDisable(true);
        		if(df==0){
        			String sTool="";
        			if(val1!=-1){
        				sTool=sTool+"\nnombre cnx VM2: "+val1;
        			}
        			if(val2!=-1){
        				sTool=sTool+"\nnombre cnx VM3: "+val2;
        			}
        			if(val3!=-1){
        				sTool=sTool+"\nnombre cnx VM4: "+val3;
        			}
        			if(val4!=-1){
        				sTool=sTool+"\nnombre cnx VM5: "+val4;
        			}
        			if(val5!=-1){
        				sTool=sTool+"\nnombre cnx VM6: "+val5;
        			}
        			
        			Tooltip tpl=new Tooltip("nombre cnx VM1: "+xtab1+""+sTool);
        			System.out.println(sTool);
        			/*for(final XYChart.Data<Number, Number> data : series.getData()){ 
     				   lastPointAdded =data.getNode();
     		        }Tooltip.install(lastPointAdded,tpl);*/
        			   for(final XYChart.Data<Number, Number> data : series.getData()){
        		        	data.getNode().addEventHandler(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>(){
        						@Override
        						public void handle(MouseEvent event) {
        						  Tooltip.install(data.getNode(),tpl );
        						}
        		        	});
        		        }
        		}
        		if(df==1){
        			String sTool1="";
        			if(val2!=-1){
        				sTool1=sTool1+"\nnombre cnx VM3: "+val2;
        			}
        			if(val3!=-1){
        				sTool1=sTool1+"\nnombre cnx VM4: "+val3;
        			}
        			if(val4!=-1){
        				sTool1=sTool1+"\nnombre cnx VM5: "+val4;
        			}
        			if(val5!=-1){
        				sTool1=sTool1+"\nnombre cnx VM6: "+val5;
        			}
        			
        			Tooltip tpl1=new Tooltip("nombre cnx VM2: "+xtab3+""+sTool1);
     			   for(final XYChart.Data<Number, Number> data : series1.getData()){
     		        	data.getNode().addEventHandler(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>(){
     						@Override
     						public void handle(MouseEvent event) {
     						  Tooltip.install(data.getNode(),tpl1 );
     						}
     		        	});
     		        }
     		}
        		if(df==2){
        			String sTool2="";
        			if(val3!=-1){
        				sTool2=sTool2+"\nnombre cnx VM4: "+val3;
        			}
        			if(val4!=-1){
        				sTool2=sTool2+"\nnombre cnx VM5: "+val4;
        			}
        			if(val5!=-1){
        				sTool2=sTool2+"\nnombre cnx VM6: "+val5;
        			}
        			Tooltip tpl2=new Tooltip("nombre cnx VM3: "+xtab4+""+sTool2);
     			   for(final XYChart.Data<Number, Number> data : series2.getData()){
     		        	data.getNode().addEventHandler(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>(){

     						@Override
     						public void handle(MouseEvent event) {
     						  Tooltip.install(data.getNode(), tpl2);
     						}
     		        		
     		        	});
     		        }
     		}
        		if(df==3){
        			String sTool3="";
        			if(val4!=-1){
        				sTool3=sTool3+"\nnombre cnx VM5: "+val4;
        			}
        			if(val5!=-1){
        				sTool3=sTool3+"\nnombre cnx VM6: "+val5;
        			}
        			
        			Tooltip tpl3=new Tooltip("nombre cnx VM4: "+xtab5+""+sTool3);
     			   for(final XYChart.Data<Number, Number> data : series3.getData()){
     		        	data.getNode().addEventHandler(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>(){

     						@Override
     						public void handle(MouseEvent event) {
     							
     						  Tooltip.install(data.getNode(),tpl3 );
     						}
     		        		
     		        	});
     		        }
     		}
        		if(df==4){
        			String sTool4="";
        			if(val5!=-1){
        				sTool4=sTool4+"\nnombre cnx VM6: "+val5;
        			}
        			
        			Tooltip tpl4=new Tooltip("nombre cnx VM5: "+xtab6+""+sTool4);
     			   for(final XYChart.Data<Number, Number> data : series4.getData()){
     		        	data.getNode().addEventHandler(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>(){

     						@Override
     						public void handle(MouseEvent event) {
     						
     						  Tooltip.install(data.getNode(),tpl4 );
     						}
     		        		
     		        	});
     		        }
     		}
        	
        
		}
	
public static void main(String[] arg ){
	launch(arg);
}


}

