//Program to print the numbers between, 1 to 100 which can be divided
// by 3 and 5 separately

import java.util.Scanner;
public class Division_Program
{
    Scanner scanner = new Scanner(System.in);
    void divideBy()
    {
        System.out.println("Enter any two numbers between 1 to 100:");
        int num1 = scanner.nextInt();//reads the first input value
        int num2 = scanner.nextInt();//reads the second input value
        System.out.println("The range of numbers given : " + num1 + " to " + num2);
        if (num1 >= 1 && num2 <= 100) //checks if number is between 1 - 100
        {
            System.out.println("The numbers divisible by 3 in the given range are: ");
            int i = num1;
            while ( i <= num2)
            {
                if ((i % 3) == 0) //checks if number is divided by 3 and remainder is 0
                {
                    System.out.print(i + " "); // prints that number
                }
                i++;
            }
            System.out.println("\n");
            System.out.println("The numbers divisible by 5 in the given range are: ");
            int j = num1;
            while ( j <= num2)
            {
                if ((j % 5) == 0)  //checks if number is divided by 5 and remainder is 0
                {
                    System.out.print(j + " "); //prints that number
                }
                j++;
            }
        }
        else
        {
            System.out.println("Invalid entry");
        }
    }
//main method
    public static void main(String[] args) {
        Division_Program divisionProgram = new Division_Program(); //create object
        divisionProgram.divideBy(); //call non-static method
    }
}

