// counting of 'a' in a given word

import java.util.Scanner;

public class CountOfa
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the word");
        String a = scanner.next();

        int cout = 0;

        for(int i=0; i<=a.length(); i++) // checking of character 'a' or 'A'
            // till length of string
        {
            if(a.charAt(i) == 'a' || a.charAt(i) == 'A')
            {
                cout = cout + 1;
            }
        }
        System.out.println("The total numbers of a are: "+cout);
    }
}
