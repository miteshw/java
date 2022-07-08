package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{



    public static void main( String[] args ){
     int a = 11;
     int i;
     for ( i = 2; i<a; i++) {

         if (a % i == 0) {
             break;
         }
     }
        if (i==a){
            System.out.println("Its A Prime Number");

     }else {
            System.out.println("Its Not A Prime Number");
        }
    }
}
