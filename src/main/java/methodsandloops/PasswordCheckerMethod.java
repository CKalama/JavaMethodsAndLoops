package methodsandloops;

import java.util.Scanner;

/**
 *
 * @author ChrisKalama
 * Write a Java Method that will check if a String is a valid password
 * Must have ten characters
 * Must have only letters and digits
 * Must have at least 2 digits
 */
public class PasswordCheckerMethod {
    
    //Creating a public integer to be used
    public static int length = 10;
    
    public static boolean charIsLetter(char ch){
        //We convert the password to all uppercase when it gets validated
        //this way if the user types capital letters it will still be good
        // if we had it with no .toUpperCase if user used Capital letters it would not compile right
        ch = Character.toUpperCase(ch);
        
        //chars need single quotes '', and Strings need double quotes ""
        return (ch>='A' && ch<='Z');
    }
    
    
    public static boolean charIsNumber(char ch){
        return (ch>='0' && ch<='9');
    }
    
    
    
    public static boolean passwordIsValid(String passcode){
        //.length() is a java keyword method that will check length of String
        if(passcode.length() < length)
            return false;
        
        int digitLength = 0;
        int letterLength = 0;
        
        //Need a for loop to  check each and every character, so a for loop is most efficient
        for(int i=0; i<passcode.length(); i++) { 
            //We wrote this first, then did the booleans up top. We need this to pass through other boolean methods above.
            //charAt is a java method that will give us a keyword at particular letter space.
            char ch = passcode.charAt(i);
            
            //This will now check the digit length
            if(charIsNumber(ch)){
                digitLength++;
            }
            //This will now check letter length
            else if(charIsLetter(ch)){
                letterLength++;
            }
            else{
                return false;
            }
        }
        return (digitLength >=2 && letterLength>=2);
    }
    
    public static void main(String[] args){
        
        System.out.println("Enter a Password:\n Must have 10 characters\n At least 2 digits\n No special characters");
        Scanner s1 = new Scanner(System.in);
        //nextLine will grab entire line of String
        String password = s1.nextLine();
        
        if(passwordIsValid(password)){
            System.out.println("Your Password is strong!!");
        }
        else{
            System.out.println("Your password is weak and didn't meet criteria!!");
        }
        
    }
    
}



//public static String passwordChecker(String password) {
//        
//        if(password <= length){
//            System.out.println("Please enter more than 10 characters");
//        };
//    }