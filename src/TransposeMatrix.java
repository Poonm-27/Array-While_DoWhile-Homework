//Program to transpose a matrix

import java.util.Scanner;
public class TransposeMatrix {
    //main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //create scanner class and create an object
        System.out.println("Enter no. of rows you want: ");
        int r = scanner.nextInt(); //input rows
        System.out.println("Enter no. of columns you want: ");
        int c = scanner.nextInt(); //input columns
        int[][] a = new int[r][c]; //size of 2d array with rows and columns user input

        System.out.println("Enter the integer values for (" +r+ " * " +c+ ") matrix :\n");
        for (int i = 0; i<r; i++) //rows
        {
            for (int j = 0; j<c; j++)  //columns
            {
                a[i][j] = scanner.nextInt(); //input array elements
            }
        }
        System.out.println("Given Matrix is: ");
        for (int i = 0; i<r; i++) //rows
        {
            for (int j = 0; j<c; j++) //columns
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("Transpose of a given matrix: ");
        for (int i = 0; i<c; i++) //rows
        {
            for (int j = 0; j < r; j++) //columns
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println(" ");

        }

    }
}

