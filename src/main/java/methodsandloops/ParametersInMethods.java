/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsandloops;

import java.util.Scanner;

/**
 *
 * @author ChrisKalama
 */
public class ParametersInMethods {
    
    
    //Here we are passing PARAMETERS - These can be named anything. 
    //The datatype should be the same however. 
    //The Parameters receive ARGUMENTS. 
    public static int greatestNumber(int number1, int number2, int number3) 
    {
        if(number1 > number2 && number1 > number3)
        {
            return number1;
        }
        else if(number2 > number1 && number2 > number3) 
        {
            return number2;
        }
        else
        {
            return number3;
        }
        
    }
    
    public static void main(String[] args) {
        
        //Going to pass these numbers through the parameters 
        System.out.println("Enter First Number: ");
        Scanner s1 = new Scanner(System.in);
        int num1 = s1.nextInt();
        
        System.out.println("Enter Second Number: ");
        Scanner s2 = new Scanner(System.in);
        int num2 = s2.nextInt();
        
        System.out.println("Enter Third Number: ");
        Scanner s3 = new Scanner(System.in);
        int num3 = s3.nextInt();
        
        
        //When we are passing through the greatestNumber function to the main Function...
        // The parameters are now ARGUMENTS of the Function. 
        System.out.println("The Greatest Number is: " + greatestNumber(num1, num2, num3));
    }
    
}
