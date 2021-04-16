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
public class WhileLoopExercise {
    
    public static void main(String[] args) {
        
        System.out.println("Please enter a number: ");
        Scanner s1 = new Scanner(System.in);
        
        int a=s1.nextInt();
        int i = 1;
        
        
        //i=1 and is always less than the number the Scanner input is, which will initialize the program
        //
        while(i<=a) 
        {
            if (i%2==0)
            {
              System.out.println(i);  
            }
            
            i++;
        }
    }
}
