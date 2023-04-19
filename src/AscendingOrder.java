//Program to enter an array and sort it in ascending order
import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {

    //main method
    public static void main(String[] args)
    {
        int [] a = new int[5]; //instantiation(size of array is 5)
        Scanner scanner = new Scanner(System.in); //create scanner class
        System.out.println("Enter any five numbers for an array");
        for (int i = 0; i < 5; i++)
        {
            a[i] = scanner.nextInt(); // print array with five integer values

        }
        Arrays.sort(a); //built-in function to sort an array
        System.out.println("Ascending Order : ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(a[i] + " ");// print ascending
        }
    }
}
