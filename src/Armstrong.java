//Program to input any number and find out if its Armstrong number or not
import java.util.Scanner;
public class Armstrong {
    //main method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // create object for scanner class
        System.out.println("Enter a number: ");
        int num = scanner.nextInt(); //allows user integer input
        int backUP = num;
        System.out.println("The number is: "+num);
        int sum = 0;
        while (num>0)
        {
            sum = sum + (num % 10) * (num % 10) * (num % 10);
            num = num / 10;
        }
        if (sum==backUP)
        {
            System.out.println(" The  number is Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}
