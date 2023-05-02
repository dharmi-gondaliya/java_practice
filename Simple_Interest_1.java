//1. WAP to calculate simple interest using method.{call Method,class Method}

import java.util.Scanner;

public class Simple_Interest_1{
  
      
       public static void main(String ab[]) {
          Simple_Interest s = new Simple_Interest();
          Scanner sc = new Scanner(System.in);
          float a,b,c;
          a = sc.nextFloat();
          b = sc.nextFloat();
          c = sc.nextFloat();
            System.out.println("Simple Interest:"+s.myMethod(a,b,c));  
           } 
}
class Simple_Interest{
  public float myMethod(float I, float R, float T){

            float sp;

            sp = (I * R * T)/100;
            
            return sp;
            
        }
       }
 /*  public static void main(String ab[]) {
    Scanner sc = new Scanner(System.in);
    float a,b,c;
          a = sc.nextFloat();
          b = sc.nextFloat();
          c = sc.nextFloat();

     System.out.println("Simple Interest:"+myMethod(a,b,c));  
    }
    public static float myMethod(float I,float R,float T){

      float sp;

      sp = (I * R * T)/100;
      
      return sp;
      
  } */


    

      
