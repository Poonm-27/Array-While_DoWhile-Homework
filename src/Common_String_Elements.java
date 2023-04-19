//Program to find the common element between two string arrays

import java.util.Arrays;
public class Common_String_Elements
{
    //main method
    public static void main(String[] args)
    {
        //string arrays declaration, instantiation and initialization
        String[] arr1 = {"nokia", "apple", "samsung", "honor", "oppo"};
        String[] arr2 = {"nokia", "sony", "oppo", "pixel", "samsung"};
        System.out.println("First String= " + Arrays.toString(arr1)); //print first string
        System.out.println("Second String= " + Arrays.toString(arr2));//print second string
        System.out.println("Common elements in the two strings are: ");
        int i = 0;
        while ( i < arr1.length) // iterating arr1
        {
            int j=0;
            while (j < arr2.length) //iterating arr2
            {
                if (arr1[i].equals(arr2[j]))
                {
                    System.out.println(arr1[i]);

                }
                j++;
            }
            i++;
        }
    }
}







