// Calculator with switch case

import java.util.Scanner; // scanner class import from Java

public class Calculator // calss name
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in); // object of scanner class

        System.out.println("Entre the 1st Digit");
        int a = scanner.nextInt(); // input from user and stored in variable

        System.out.println("Entre the 1st Digit");
        int b = scanner.nextInt();

        System.out.println("Choose the operator from +,-,*,/");
        char o = scanner.next().charAt(0);

        // switch case use
        switch (o) {
            case '+':
                System.out.println("The sum of "+a+" and "+b+" is " +(a+b));
                break;
            case '-':
                System.out.println("The subtraction of "+a+" and "+b+" is " +(a-b));
                break;
            case '*':
                System.out.println("The multiplication of "+a+" and "+b+" is " +(a*b));
                break;
            case '/':
                System.out.println("The division of "+a+" and "+b+" is " +(a/b));
                break;
        }
    }
}
