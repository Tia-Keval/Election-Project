# Election-Project 

/* Pratical 4
 * Tia R Skarin ( 21445691 )
 *                 (  ) 
 * Dr Ikram Ur Rehamn
 */
package pratical4;

import java.util.Scanner;
import java.util.Arrays;

public class Pratical4 {

public static final String ANSI_RED = "\u001B[31m"; // import a colour fuction for key infomation
public static final String ANSI_BLUE = "\u001B[34m" ;    
public static final String ANSI_RESET = "\u001B[0m";  

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println(" PRATICAL  4 ");
         
        System.out.println("Please press X once done and want to procced to the votes.");  
        System.out.println("Please start entering, who you would like to vote for ");
        System.out.println();
        
        
        String vote ;    
        vote = " abc ";
        //int quanity ;
        //quanity = 0;
        //double totalAmount;
        //totalAmount = 0;
        
         
        
        while (!"x".equals(vote) ) { 
        Scanner input = new Scanner(System.in);
       // vote = input.nextLine();
        
        int [] mylist = new int [10]; //shouldnt be 10, needs to be changed for no limit 
        //Scanner input = new Scanner(System.in);
        System.out.println("Enter "+ mylist.length + " votes:");
        for (int i =0; i < mylist.length; i++) 
        {
            mylist[i] = input.nextInt();
        }
        
       int max = mylist[0]; // for the highest votes????
       for (int i = 0; i < mylist.length);
       
       
       
       
        }   
           
           
           
        System.out.println() ;
        System.out.println() ;
        System.out.println("-------------------------------------------------------------------") ;
        //System.out.println(ANSI_RED + "Your Basket:" +ANSI_RESET);
        System.out.println() ;
        Thread.sleep(500);
        System.out.println(ANSI_RED + "  :" + ANSI_RED + "recieved" + ... +ANSI_RESET ) ;
        System.out.println("-------------------------------------------------------------------") ;
        System.out.println() ;
        Thread.sleep(500);
        System.out.println( ANSI_RED + "The Winner is" + ANSI_RED + ,, + ,, );
            
   // System.out.println(ANSI_RED + "Thank you for using" + title.toUpperCase());

   
    }
    
}

/* user enters individual votes
ends when entered an empty line or -1 - while loop 

string array and count array 
prints votes 
prints winner
*/
