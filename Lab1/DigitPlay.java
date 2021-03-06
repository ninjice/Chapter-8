package Lab1;



// *******************************************************************
//   DigitPlay.java
// 
//   Finds the number of digits in a positive integer.
// *******************************************************************

import java.util.Scanner;

public class DigitPlay
{

    public static void main (String[] args)
    {
    int num;    //a number

    Scanner scan = new Scanner(System.in);

    System.out.println ();
    System.out.print ("Please enter a positive integer: ");
    num = scan.nextInt ();
  
    if (num <= 0)
        System.out.println ( num + " isn't positive -- start over!!");
    else 
        {
        // Call numDigits to find the number of digits in the number
        // Print the number returned from numDigits
        System.out.println ("\nThe number " + num + " contains " +
                    + numDigits(num) + " digits, with a sum of "
                    + sumDigits(num) + ".");
        System.out.println ();
        }
    }

    // -----------------------------------------------------------
    //  Recursively counts the digits in a positive integer 
    // -----------------------------------------------------------
    public static int numDigits(int num)
    {
    if (num < 10)
        return (1);
    else
        return (1 + numDigits(num/10));
    }
    
    // -----------------------------------------------------------
    //  Recursively adds the digits in a positive integer 
    // -----------------------------------------------------------
    public static int sumDigits(int num)
    {   
        if (num == 0)
        {
            return 0;
        }
        else{
            String str = Integer.toString(num) + "0";
            return Integer.valueOf(str.substring(0, 1)) + sumDigits(Integer.valueOf(str.substring(1)));
        }
    }
}

