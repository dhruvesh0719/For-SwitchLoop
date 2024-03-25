// sum of the natural number

import java.util.Scanner;

public class SumofNaturalNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the Digit");
        int a = scanner.nextInt();

        int sum = 0;

        for(int i=1; i<=a; i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum of given natural number "+a+" is "+sum);
    }
}
