// sum of the range

import java.util.Scanner;

public class SumOfRange
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the Smaller digit of the range");
        int a = scanner.nextInt();

        System.out.println("Entre the bigger digit of the range");
        int b = scanner.nextInt();

        int sum = 0;

        for(int i=a; i<=b; i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum of given range of "+a+" and "+b+" is "+sum);
    }
}
