import java.time.Clock;
import java.util.Scanner;

public class CheckEvenOrOddNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if(number % 2 == 0)
        {
            System.out.println(number+"  is Even number");
        }
        else
        {
            System.out.println(number+"  is odd number");
        }
    }
}
