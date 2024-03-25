// Factorial number

import java.util.Scanner;

public class FactorialNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the Digit");
        int a = scanner.nextInt();
        int b = a; //need entered value to print in last so stored in another variable

        int mul = 1;

        for(int i=a; i>0; i--)
        {
            mul = mul * a;
            a = a - 1;
        }
        System.out.println("The Factorial value of "+b+" is : "+mul);
    }
}
