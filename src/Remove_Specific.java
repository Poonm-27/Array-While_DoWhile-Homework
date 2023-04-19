//Program to remove specific element of an array
import java.util.Scanner;

public class Remove_Specific {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//create object for scanner class
        System.out.println("Enter the size of an array: ");
        int size = scanner.nextInt();// enter size of array
        int [] array = new int[size];
        System.out.println("Enter the elements of an array: ");

        for (int i = 0; i < size; i++)
        {
            System.out.println("Element at index " +i+ " : ");
           array[i] = scanner.nextInt();

        }
        System.out.println("Entered array is : " );

        for (int i = 0; i < size; i++)
        {
            System.out.print( array[i] +" ");
        }
        System.out.println("\n");

        // Find index of element to be removed
        System.out.println("Enter array index (location) to be deleted: ");
        int loc = scanner.nextInt();
        for (int i = loc; i < size-1; i++) // Shift elements to the left of the indexToRemove
        {
            array[i] =array[i+1];
        }
        size--;
        System.out.println("The new array is: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print( array[i]+" ");
        }

        }
}




