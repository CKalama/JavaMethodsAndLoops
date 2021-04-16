/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsandloops;

/**
 *
 * @author ChrisKalama
 */
public class NaturalNumbersExercise {
        
    public static void main (String[] args){
        
        int num = 100;
        int count = 1;
        int total = 0;
        
        while (count <= num) 
        {
            total=total +count;
            count++;
        }
        System.out.println("The sum of first 100 natural numbers is: " + total);
        
    }
}
