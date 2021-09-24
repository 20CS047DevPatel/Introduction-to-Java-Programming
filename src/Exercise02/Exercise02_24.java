package Exercise02;

/**
 *
 * @author : DEV PATEL
 *    Id   : 20CS047
 * 
 * 
 * (Financial application: monetary units) Rewrite Listing 2.10,
    ComputeChange.java, to fix the possible loss of accuracy when converting a
    double value to an int value. Enter the input as an integer whose last two digits
    represent the cents. For example, the input 1156 represents 11 dollars and 56 cents.
 */
import java.util.Scanner;

public class Exercise02_24 {
    public static void main(String[] args) {
        System.out.println("Enter an Amount for example, 1156:");
        //Reading the amount entered from the user
        Scanner input = new Scanner(System.in);
        
                int amount = input.nextInt();
                //last two digits(Cents) will be extracted
                int numberOfCent = (int)(amount % 100);
                //reamining digits(dollar) will be extracted
                int numberOfdollar = amount / 100;
                
                System.out.println(" Your amount consists of \n" + numberOfdollar + " dollar\t" + numberOfCent +  " cents ");
    }
}
