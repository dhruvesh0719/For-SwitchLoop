//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in th

// print the 10 numbers of given range

import java.util.Scanner;

public class Print10Numbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the 1st Digit");
        int a = scanner.nextInt();

        System.out.println("Entre the 2nd Digit");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }

    }
}