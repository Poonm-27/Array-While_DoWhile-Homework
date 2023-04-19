//Program to reverse a given number
import java.util.Scanner;

public class Reverse {
    //main method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//create object for scanner class
        System.out.println("Enter a number : ");
        int num = scanner.nextInt(); // returns integer value
        System.out.println("The given number is: "+num);
        int remainder;
        int rev = 0;
        while (num > 0)
        {
            remainder = num % 10;
            rev = rev*10 + remainder;
            num = num / 10;

        }
        System.out.println("Reverse of the number is: " +rev);
    }
}
