// sum of the fraction series for given number

import java.util.Scanner;

public class SumOfFractionSeries
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the digit");
        int a = scanner.nextInt();

        int b = a;
        double sum = 0;

        if(a > 0)
        {
            for(int i=1; i<=a; i++)
            {
                sum = sum + ((double) 1 /b);
                b = b - 1;
            }
            System.out.println("The sum of the series is : "+sum);
        }
        else {
            System.out.println("Entre the positive number");
        }

    }
}
