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

//WE are going to print a diamond of asteriks. 
public class ForLoopExercise {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the Amount of Rows");
        Scanner s1 = new Scanner(System.in);
        int rows = s1.nextInt();
        //We need the -1 to minimize the amount of spaces so that it looks nice.
        int space = rows - 1;
        
        int j;
        int i;
        
        for (j=1; j<=rows; j++) 
        {
            for(i=1; i<=space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            
            for (i=1; i<=2*j-1;i++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        space = 1;
        for(j=1; j<=rows-1; j++)
        {
            for(i=1; i<=space; i++)
            {
                System.out.print(" ");
            }
            
            space++;
            
            for(i=1; i<=2*(rows-j); i++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
    
}
