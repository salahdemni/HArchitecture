package hstl;
import javax.swing.*;
import java.awt.Color;
import java.io.*;
import java.util.*;
import java.awt.Graphics;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class multitreeplot extends JFrame {
    public void paint(Graphics paint){
        super.paint(paint);
      int[][] data;
      int NMax = 500; // number of nodes in the topology
      int dx = 100, dy = 100 , rectSize = 500;
        data = new int[NMax][2];
      int Ovalsize = 6;
      int Plus = 1;
      double radiorange =50;
     try{
//nodes
        
    FileReader fG = new FileReader("OriginalTopoPos.txt");
      BufferedReader bufReadG = new BufferedReader(fG);
//sink
      FileReader fSinks = new FileReader("SinksFile.txt");
      BufferedReader bufReadSinks = new BufferedReader(fSinks);

           setTitle("MultiTree Drawer");
         
         
         // The whole background
         paint.setColor (Color.white);
          paint.fillRect (0,0,700,700);
         
          // Determine the size of the area.
          paint.setColor (Color.black);
           paint.drawRect (dx-1,dy-1,rectSize+1,rectSize+1);
           paint.drawRect (dx-2,dy-2,rectSize+1,rectSize+1);
           paint.setColor (Color.white);
           paint.fillRect (dx+1,dy+1,rectSize-2,rectSize-2);

           //Plot the original topology.
          NMax = 0;
          String lineG =new String( bufReadG.readLine());
           while (lineG != null){
              int index= lineG.indexOf("-");
            double x= (new Double(lineG.substring(0, index))).doubleValue();
            double y= (new Double(lineG.substring(index+1, lineG.length()))).doubleValue();

            // ** Reflect the image
                  // Aseel, in your experiment do not divide y, x by 10///
             y=rectSize-y/10;                                             
               x = (int)(x/10.0) + 100;
              y = (int)(y) + 100;              
              data[NMax][0] = (int)(x);
              data[NMax][1] = (int)(y);
                           
              System.out.println((int)x+","+(int)y);
           
               String s = String.valueOf(NMax);
                paint.setColor (Color.gray);
                paint.drawString(s, (int)x+4,(int)y-1);
                
                paint.setColor (Color.blue);
                paint.drawOval((int)x-4,(int)y-4, Ovalsize+Plus, Ovalsize+Plus);
             
             paint.setColor (Color.blue);
                paint.fillOval((int)x-3,(int)y-3, Ovalsize, Ovalsize);
                lineG = bufReadG.readLine();
               NMax++;
           }
           
           
           
           //Plot the links in original Topology.
           // *********************************
      //   
          for (int i =0 ; i < NMax; i++)
            for (int j =i ; j < NMax; j++){
               double distance = Math.pow(data[i][0]-data[j][0],2)+ Math.pow(data[i][1]-data[j][1],2);
                distance = Math.sqrt(distance);
                paint.setColor (Color.gray);
                if (distance <= radiorange)
                   {
                      //gradient
                      //pink
                      //magenta
                      //cyan
            paint.setColor (Color.magenta);
                   paint.drawLine( data[i][0], data[i][1], data[j][0],data[j][1] );
                   }
         
                
            }
   //     */

           
           //Plot Sink Nodes.
         int Sinks = 0;
         String lineSinks =new String( bufReadSinks.readLine());
         while(lineSinks != null){
            int index= lineSinks.indexOf("-");
            double x= (new Double(lineSinks.substring(0, index))).doubleValue();
            double y= (new Double(lineSinks.substring(index+1, lineSinks.length()))).doubleValue();
         
            //Reflect the image
            y=rectSize-y/10;                                             
               x = (int)(x/10.0) + 100;
              y = (int)(y) + 100;   
             
             paint.setColor (Color.blue);
                paint.drawRect((int)x-5,(int)y-4, Ovalsize+Plus, Ovalsize+Plus);
             
             paint.setColor (Color.green);
                paint.fillRect((int)x-4,(int)y-3, Ovalsize, Ovalsize); 
                   
                //String s = String.valueOf(NMax);
                String s = "Sink";
                paint.setColor (Color.gray);
                paint.setColor (Color.black);
                paint.drawString(s, (int)x+12,(int)y-5);       
               
             lineSinks = bufReadSinks.readLine();
                Sinks++;
           }
           //System.out.println(Sinks);
           
           
     }catch(Exception e){
        System.out.println(e);
        System.exit(-1);
     }

   }

    public multitreeplot(){
        super("");
      int WSize = 700;
        setSize(WSize,WSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
public static void main(String [] args) throws Exception{
    JFrame win= new JFrame();
    multitreeplot drawing= new multitreeplot();
    drawing.setVisible(true);
}
}
//System.out.println((int)x+","+(int)y); - See more at: http://www.codemiles.com/java/java-code-to-draw-shortest-path-tree-t10650.html#sthash.EQ0e2ty0.dpuf