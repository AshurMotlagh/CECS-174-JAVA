package Week01;
import java.util.*;

public class Arithmetic {
    public static void main (String [] arg) {
        Scanner sc = new Scanner(System.in); //my_acct = BA()
        System.out.print("Enter an integer: ");
        int user = sc.nextInt();
        int pow = user^3;
        System.out.println("You entered: " + user);
        System.out.println(user + " squared is " + user*user);
        System.out.println("and " + user + " cubed is " + pow);
        System.out.print("Enter another integer: ");
        int user2 = sc.nextInt();
        int sum_user = user + user2;
        System.out.println(user + " + " + user2 + " is " + sum_user);
        System.out.println(user + " * " + user2 + " is " + user*user2);
    }
}
