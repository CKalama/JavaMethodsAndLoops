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
public class DoWhileLoopExercise {
    
    public static void main(String[] args){
        int i = 1;
        
        
        do
        {
            System.out.println("Please enter your Username");
            Scanner s1 = new Scanner(System.in);
            String username = s1.next();
            
            System.out.println("Please enter your Password");
            Scanner s2 = new Scanner(System.in);
            String password = s2.next();
            
            if(username.contains("java") && password.contains("programming"))
            {
                System.out.println("You are logged in!");
                    //break will also break a loop. 
                   break;
            }
            else 
            {
                System.out.println("Please try again");
                i++;
            }
            
        }while(i<=3);
        
        
    }
    
}
