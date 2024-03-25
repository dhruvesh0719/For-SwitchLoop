// multiplication table up to 12

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the digit");
        int a = scanner.nextInt();

        int mul = 1;
        int b = 1;

        for(int i=1; i<=12; i++)
        {

            mul = a * b; // formula to get correct value of multiplication
            System.out.println(+a+" X "+b+" = "+mul);
            b = b + 1;

        }
    }
}
