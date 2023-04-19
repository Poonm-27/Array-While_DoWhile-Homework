public class Find_Common {
    //main method
    public static void main(String[] args) {

        // Creating two string arrays
        String[] arr1 = {"elephant", "cat", "dog", "mouse"};
        String[] arr2 = {"elephant", "cat", "mouse", "lion", "zebra"};
        // Displaying the array
        System.out.print("Array 1 : ");
        printArray(arr1);//print Array 1;
        System.out.print("Array 2 : ");
        printArray(arr2); //print array2
        System.out.print("The common elements are : ");
        // Print common elements
        printCommon(arr1, arr2);

    }

    // Function to print the array
    static void printArray(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printCommon(String[] arr1, String[] arr2) {
        // Checks for common elements
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i].equals(arr2[j]))
                {
                    System.out.print(arr1[i] + " ");
                }
            }

        }
    }
}
