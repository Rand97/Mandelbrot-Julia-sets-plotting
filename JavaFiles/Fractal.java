import javax.swing.*;

/*
 * Author : P.M.M.P Randeniya
 * ENumber : E/16/313
 * Task : Plot the Mandelbrot Fractal & Julia Fractal for given range of interest
 */

/*
 * This is class Fractal which include main method
 * User may give range of interest with set name ,if not set will plot according to default values. 
 */
class Fractal{

    public static void main(String [] args){
    	//create the JFrame & name it according to the set name
    	JFrame frame = new JFrame(args[0]+ " Set"); 
    	//program will exit by click close button in frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        //checking the set type along with user input arguments counts
        if (args[0].equals("mandelbrot") || args[0].equals("Mandelbrot")){
	        /*
	         * if arguments counts is equal to 1,5 or 6,set may plot
	         * if not usage message will occur
	         */
	        if(args.length == 1){frame.setContentPane(new Panel());}
	        else if (args.length == 5){	
	        	if(Double.parseDouble(args[1]) < Double.parseDouble(args[2]) && Double.parseDouble(args[3]) < Double.parseDouble(args[4])){

	    	        frame.setContentPane(new Panel(Double.parseDouble(args[1]), Double.parseDouble(args[2]),
	    	                       Double.parseDouble(args[3]), Double.parseDouble(args[4]))); 
	            }
	            else{
	            	System.out.println("Invalid arguments.Try again.");
	            	System.exit(0);
	            }
	        }
	        else if(args.length == 6){
	            if(Double.parseDouble(args[1]) < Double.parseDouble(args[2]) && Double.parseDouble(args[3]) < Double.parseDouble(args[4])
	            	                         && Double.parseDouble(args[5]) > 0){

	    	        frame.setContentPane(new Panel(Double.parseDouble(args[1]), Double.parseDouble(args[2])
	    		                 , Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5])));
	    	    }
	    	    else{
	            	System.out.println("Invalid arguments.Try again.");
	            	System.exit(0);
	            }
	    	        
	        }
	        else{
	        	System.out.println("Usage <Mandelbrot>");
	        	System.out.println("Usage <Mandelbrot> <Minimum real value> <Maximum real value> <Minimum coplex value> <Maximum coplex value>  ");
	    	    System.out.println("Usage <Mandelbrot> <Minimum real value> <Maximum real value> <Minimum coplex value> <Maximum coplex value> <Number of iteration> ");
	    	    System.out.println("Use either of above formats");
	    	    System.exit(0); 
	    	    
	        }
	         	             
        }
        else if (args[0].equals("julia") || args[0].equals("Julia")){ 
        	 /*
	         * if arguments counts is equal 0 or 3,set may plot
	         * if not usage message will occur
	         */
	    
	        if(args.length == 1){frame.setContentPane(new Panel(args[0]));}
	        else if (args.length == 3){	
	    	    frame.setContentPane(new Panel(Double.parseDouble(args[1]), Double.parseDouble(args[2]))); 
	        }
	        else if (args.length == 4){	
	        	if(Double.parseDouble(args[3]) > 0){

	    	       frame.setContentPane(new Panel(Double.parseDouble(args[1]), Double.parseDouble(args[2]),Double.parseDouble(args[3]))); 
	            }
	            else{
	            	System.out.println("Invalid arguments.Try again.");
	            	System.exit(0);
	            }
	        }
	        else{
	        	System.out.println("Usage <Julia> ");
	    	    System.out.println("Usage <Julia> <real value of constant> <complex value of constant>");
	    	    System.out.println("Use either of above formats");
	    	    System.exit(0); 
	        }  	             
        }
        else{
        	//if set name is wrong or another type of set, print the error message
        	System.out.println("Error: Couldn't find set type");
        	System.exit(0); 
        }
        frame.setResizable(false);  //Disabled the resizing of JFrame
        frame.pack(); 
        frame.setLocationRelativeTo(null); //set JFrame center of the screen
        frame.setVisible(true); //set JFrame visible to user

   }


}
