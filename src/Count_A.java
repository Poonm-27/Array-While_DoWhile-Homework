//Program to enter any String and count total number of 'a' in that String
import java.util.Scanner;

public class Count_A {
    Scanner scanner = new Scanner(System.in);//create object of scanner class to read user input
    //no return type and no parameters
    void check_alphabet()
    {
        System.out.println("Enter any text which contains alphabet 'a' :");
        String text = scanner.nextLine();//returns next line of text
        System.out.println("The String given is: " + text);
        int count=0;
        int i = 0;
        while (i<text.length())
        {
            if ( text.charAt(i)== 'a') //checks if character at index position 'i' is equal to a
            {
                count++;
            }
            i++;
        }
        System.out.println("The total number of a's in the text is " +count);
    }
    //main method
    public static void main(String[] args)
    {
        Count_A countA = new Count_A();//create object
        countA.check_alphabet();//call non-static method
    }
}
