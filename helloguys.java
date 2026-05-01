
/**
 * Write a description of class helloguys here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



//import user input

import java.util.*;
public class helloguys
{
    public static void main(String args[])
    {
        String strFood = "ice cream";
        
        //prompt user to enter their favourite food
        System.out.println("Please enter your favourite food");
        
        strFood = new Scanner(System.in).nextLine();
        
        

        byte i = 0;
        
        while(i<5)
        {
            System.out.println("Give me " + strFood);
            
            i++;
            
            
        }

      

    }
}