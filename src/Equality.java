//program to test the equality of two arrays
import java.util.Arrays;
public class Equality {

    //array declaration, instantiation and initialization
    int [] a = {1,2,3,4,5,6,7,8};
    int [] b = {1,2,3,4,5,6,7,8,9,10};
    //method with no return type and no parameters
    void check_equality()
    {
        System.out.println("a = "+ Arrays.toString(a));
        System.out.println("b = "+ Arrays.toString(b));
        boolean result ; //variable to store result
        result = Arrays.equals(a,b); // check whether two arrays a and b are equal or not
        if(result==true)
        {
            System.out.println("Two arrays are equal"); //if true print this statement
        }
        else
        {
            System.out.println("Two arrays are not equal");//if false print this statement
        }
    }

    public static void main(String[] args) // main method
    {
        Equality equality = new Equality(); //create object
        equality.check_equality();//call non-static method
    }


}
