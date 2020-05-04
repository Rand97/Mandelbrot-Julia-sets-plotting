import java.awt.*; 
import javax.swing.*;
import java.awt.geom.Line2D;
/*
 * This is class Panel which has extended JPanel
 * This class include the content of JFrame
 * main functionality of this is plotting the given set 
 */

final class Panel extends JPanel { 

    //define the variables 
    private static final long serialVersionUID = 1L;
    private double realMin,realMax,imgMin,imgMax;
    private double iteration,x,y;
    private String setName;
    private double real,img;
    private Set set;
   
    
    { 
      setPreferredSize(new Dimension(800,800));//Always set the JFame size to 800*800
      iteration = 1000d; //set the default iteration count as 1000,this may change by inside of constructors
      setName = "mandelbrot";  //set default set name as mandelbrot
      
    }
    public Panel(String setName){ // constructor which used no argument input for Julia set
      real = -0.4;
      img = 0.6;
      this.setName = setName; 
    }
    public Panel(){      // constructor which used no argument input for Mandelbrot set
      realMin = -1d;
      realMax = 1d;
      imgMin = -1d;
      imgMax = 1d;    
    }
    // constructor which used to get 2 user inputs for julia set
    public Panel(double real, double img){  
      this.real = real;
      this.img = img;
      setName = "julia"; 
    }   
    // constructor which used to get 3 user inputs for julia set
    public Panel(double real, double img,double iteration){  
      this.real = real;
      this.img = img;
      this.iteration = iteration;
      setName = "julia"; 
    }   
    // constructor which used to get 4 user inputs for Mandelbrot set
    public Panel(double realMin, double realMax, double imgMin, double imgMax){
      this.realMin = realMin;
      this.realMax = realMax;
      this.imgMin = imgMin;
      this.imgMax = imgMax;
    }
    // constructor which used to get 5 user inputs for Mandelbrot set
    public Panel(double realMin, double realMax, double imgMin, double imgMax, double iteration){
      this(realMin,realMax,imgMin,imgMax);
      this.iteration = iteration;
    }

    
    //this method plot the point which we give to it with type of color and x,y pixel coordinates
    private static void printPoint(Graphics2D frame, Color c, double x,double y) {
      frame.setColor(c);   //set color as c
      frame.draw(new Line2D.Double(x, y, x, y)); //plot the pixel
        
    }
    /*
     * This is a overriding method 
     * we include everything that what we want to visible in JFrame in here
     * if a point belongs to set we plot it as black if not we assign a color according to number of iterations
     */
    public void paintComponent(Graphics g) { 
     //add features of parent class JPanel
     super.paintComponent(g); 
     //check the set type and instantiate object according to its type
       if(setName.equals("mandelbrot")) {
            set = new Mandelbrot(realMin,realMax,imgMin,imgMax,iteration);        
       }     
       else {
          set = new Julia(real,img,iteration);
       }    
       //in this loop we check every pixel point in canvas is belongs to the set or not by method isSet
       y = 0d;
       while(y <= 800){
           x = 0d;
           while(x <= 800){
                if(set.isSet()){  //if true returns paint black
                  printPoint((Graphics2D)g, new Color(0,0,0),x,y);
                }
                else{
                  //if not a belongs to set color according to set type and number of iterations  
                  if(setName.equals("julia") || setName.equals("Julia")) {
                      printPoint((Graphics2D)g, Color.getHSBColor((float)((Julia)set).i/250f, 0.5f, 
                                 (float)((Julia)set).i/((float)((Julia)set).i+30f)),x,y);
                  }
                  else {printPoint((Graphics2D)g, Color.getHSBColor((float)((Mandelbrot)set).i/256f, -1, 
                                   (float)((Mandelbrot)set).i/((float)((Mandelbrot)set).i+30f)),x,y);}
                }
                  x = x + 1d;
            }
            y = y + 1d;
        }
    }
       
    
}    
