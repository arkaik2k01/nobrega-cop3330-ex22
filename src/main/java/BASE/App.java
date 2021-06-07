package BASE;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
Challenges
Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
*/

import java.util.Scanner;

public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        int big = 0;
        int compare;

        //Main algorithm. Takes in three numbers and compares if biggest
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.print("Enter the first number: ");
                    big = in.nextInt();
                    break;
                case 1:
                    System.out.print("Enter the second number: ");
                    compare = in.nextInt();
                    if (compare > big)
                        big = compare;
                    break;
                case 2:
                    System.out.print("Enter the third number: ");
                    compare = in.nextInt();
                    if (compare > big)
                        big = compare;
                    break;
            }
        }

        System.out.println("The largest number is: " + big);
    }
}
