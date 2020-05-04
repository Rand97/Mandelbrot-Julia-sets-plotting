/*
 * this is Mandelbrot class which extends abstract class Set
 * Functionality of this class is mapping pixel points according to user given 
 * range of interest,
 * and checking each point is belong to Mandelbrot set
 */

class Mandelbrot extends Set{
    //define variables
    private double realMin,realMax,temp;
    private double imgMin,imgMax;
    private double iteration,x,y;
    double i;
    //constructor to get input values
    public Mandelbrot(double a, double b, double c, double d, double e){
        this.realMin = a;
        this.realMax = b;
        this.imgMin = c;
        this.imgMax = d;
        this.iteration = e;
        this.temp = a;
        
        this.x = (b - a)/800d;
        this.y = (d - c)/800d;
       
    }
    /*
     * Mandelbrot equation --> Zn+1 = Zn^2 + C
     * This method is checking mapped point is belong or not to the Mandelbrot set
     * by running given number of iterations
     * check all the values of range of interest by changing C
     */
    public boolean isSet(){
        i = 0;
        ComplexNumber z0 = new ComplexNumber(0,0); //initial value of Zn
        ComplexNumber c = new ComplexNumber(realMin,imgMax); //constant value(C in the equation)

        if(realMin < realMax){
            realMin = realMin + x;
        }
        if(realMin > realMax){
            if(imgMax > imgMin) {
                imgMax = imgMax - y;
                realMin = temp;
            }
        }

        while(i < iteration){

            z0 = ComplexNumber.sum(ComplexNumber.mul(z0),c);

            i = i + 1;  

            if(ComplexNumber.abs(z0) > 4){return false;}
            
        }
        return true;
    
    }

}
