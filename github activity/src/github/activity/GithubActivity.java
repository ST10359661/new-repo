/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github.activity;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class GithubActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a string to check for a digit: ");
        String word = obj.nextLine();
        
        //call a methd that validate a string for a digit
        
        CheckForDigit check = new CheckForDigit();
        
        System.out.println("String has a digit?: " + check.DigitMethod(word));
        
    }//end of the method
   public static class CheckForDigit{
       public boolean DigitMethod(String input){
           for(int i = 0; i < input.length(); i++)
           {
               if(Character.isDigit(input.charAt(i))){
                   return true;
               }
           }
           return false;
   }
   
   }//end of check for digit class
}
