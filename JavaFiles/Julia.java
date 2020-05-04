/*
 * this is Julia class which extends abstract class Set
 * Functionality of this class is mapping pixel points according to user given 
 * range of interest,
 * and checking each point is belong to Julia set
 */
class Julia extends Set{
    //define variables
    private double real,img,iteration,x,y,temp;
    private double realMin,realMax,imgMin,imgMax;
    double i;

    //always used default range of interest
    {
     realMin = -1d;
     realMax = 1d;
     imgMin = -1d;
     imgMax = 1d;
     temp = -1d;
     x = (realMax - realMin)/800d;
     y = (imgMax - imgMin)/800d;
    }
    //constructor to get input values
    public Julia(double real, double img, double iteration){
        this.real = real;
        this.img = img;
        this.iteration = iteration;
    }
    /*
     * Mandelbrot equation --> Zn+1 = Zn^2 + C
     * This method is checking mapped point is belong or not to the Mandelbrot set
     * by running given number of iterations
     * check all the values of range of interest by changing Z
     */

    public boolean isSet(){
        i = 0;
        ComplexNumber z0 = new ComplexNumber(realMin,imgMax); //initial Zn value
        ComplexNumber c = new ComplexNumber(real,img); //constant value,its not change

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