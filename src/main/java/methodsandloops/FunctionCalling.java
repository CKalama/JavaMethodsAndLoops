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
public class FunctionCalling {
    
    
    //NOTICE: We didnt use keyword VOID, we had to use INT.
    //This is because when we have a return keyword, depending on the data type we need to change the void to that.
    //In this case it was int
    public static int Addition() {
        System.out.println("Enter First Number: ");
        Scanner s1 = new Scanner(System.in);
        int number1 = s1.nextInt();
        
        System.out.println("Enter a Second Number");
        Scanner s2 = new Scanner(System.in);
        int number2 = s2.nextInt();
        
        return number1 + number2;
    }
    
    
    public static void main(String[] args) {
        
        //If you call the function like this with a return keyword, nothing will appear.
        //We need to put it within System.out.println
        //Addition();
        
        System.out.println("Result" + Addition());
        
    }
    
}
