package Exercise04 ;

/**
 *
 * @author Dev Patel
 * 20CS047
 * (Find the factors of an integer) Write a program that reads an integer and displays
   all its smallest factors in increasing order. For example, if the input integer is 120,
   the output should be as follows: 2, 2, 2, 3, 5.
 */ 
import java.util.Scanner;
public class Exercise04_16 {
   


 public static void main(String[] args) 
 {
     //variable dive value 2
  int div=2;
    //Scanner input for user input
  Scanner input = new Scanner(System.in);
    //printing to get user input
  System.out.print("Enter Integer Value : ");
  int number = input.nextInt();
    //while loop with nested if
  while(number > 1)
  {
      //if with nested if
   if(number%div==0)
   {
    System.out.print(div);
    number=number/div;
    //nested if
    if(number==1)
    {
        System.out.println();
        break;
    }
    System.out.print(",");
   }
   else
   {
       //increament
    div++;
   }
  }
 }
}
