//Fibonacci series fro given number

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the Digit");
        int b = scanner.nextInt(); //stored user input

        int a = 1; // initiate 1st number of series
        int c = 1; // initiate 2nd number of series
        int d; // declared another int to store sum of two digits

        System.out.print(a+" "+c); // print 1st & 2nd number

        for(int i=2; i<=b; i++)
        {
            d = a + c; // stored 1st and 2nd digits sum
            System.out.print(" "+d); // print the number
            a = c; // swap the 2nd digit to 1st digit
            c = d; // swap the sum to 2nd digit

        }
    }
}
