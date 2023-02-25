import java.io.*; //pulling in the * for the program
public class Main {

    public static void printStars(int n) // Function to demonstrate printing pattern
    {
        int i, j;


        for(i=0; i<n; i++)// outer loop to handle number of rows
                          //  n in this case
        {


            for(j=0; j<=i; j++)//  inner loop to handle number of columns
                               //  values changing according to outer loop
            {
                System.out.print("* "); // printing stars
            }
            System.out.println(); // ending line after each row
        }
    }
    public static void main(String args[]) // Driver Function
    {
        int n = 5;
        printStars(n);
    }
}