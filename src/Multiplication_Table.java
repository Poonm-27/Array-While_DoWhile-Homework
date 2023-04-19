/* Program to print multiplication table using do while loop
1 2 3
2 4 6
3 6 9  */
public class Multiplication_Table {
    //main method
    public static void main(String[] args)
    {
        int tableSize = 3; // Define the size of the table
        int multiplier = 1; // Initialize the multiplier to 1

        System.out.println("Multiplication Table:");

        do {
            int multiplicand = 1; // Initialize the multiplicand to 1

            do {
                int result = multiplier * multiplicand; // Calculate the result
                System.out.print(result + " "); // Print the result
                multiplicand++; // Increment the multiplicand
            } while (multiplicand <= tableSize); // Repeat until multiplicand is greater than tableSize

            System.out.println(); // Print a newline after each row
            multiplier++; // Increment the multiplier
        } while (multiplier <= tableSize); // Repeat until multiplier is greater than tableSize

    }

}


