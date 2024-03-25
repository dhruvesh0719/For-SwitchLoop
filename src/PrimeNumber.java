// check the given number is prime or not

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the Digit");
        int a = scanner.nextInt();

        int count = 0;

        if(a >= 0) // checking the number is greater than 0 or not, if not then not prime number
        {
            for(int i=1; i<=a; i++)
            {
                int b = a % i; // store the moduler of number divide by each number

                if(b == 0) // checking moduler is = 0 or not
                {
                    count = count + 1; // increment count
                }
            }
                if(count > 2) // prime number only divide by 1 and the number itself
                    // so if count is more than 2 then number is not prime number
                {
                    System.out.println("The number is not Prime Number");
                }else
                {
                System.out.println("The number is Prime Number");
                }
        }else
        {
            System.out.println("The number is not Prime Number");
        }
    }
}
