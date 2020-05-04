
/*
 * This is ComplexNumber class
 * Functionality of this class is add,multiply and 
 * absolute value of given complex number 
 */
class ComplexNumber {

  //for real and imaginary parts of complex numbers
   double real, img;
  
   //constructor to initialize the complex number
   ComplexNumber(double r, double i){
      this.real = r;
      this.img = i;
   }
   //methods which is add two complex numbers
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
  //creating a temporary complex number to hold the sum of two numbers
       ComplexNumber temp = new ComplexNumber(0, 0);

       temp.real = c1.real + c2.real;
       temp.img = c1.img + c2.img;
       
       //returning the output complex number
       return temp;
   }
   //method which is multiply given complex Number
   public static ComplexNumber mul(ComplexNumber c){

       ComplexNumber temp = new ComplexNumber(0, 0);

       temp.real = (c.real*c.real)-(c.img*c.img);
       temp.img = 2d*c.real*c.img;
       
       //returning the output complex number
       return temp;
   }
   //method which which give absolute value of complex Number
   public static double abs(ComplexNumber c) {
     
     double temp;
     temp = (c.real * c.real) + (c.img * c.img);
     
     return temp;
   }


}


  








