// print the reverse number

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the Number");
        int a = scanner.nextInt();

        int rev = 0;

        for(int i=1; i<=a; i++)
        {
            rev = rev * 10 + (a%10); // formula to reverse number
            a = (a/10);
        }
        System.out.println("The Reverse number is: "+rev);
    }
}
