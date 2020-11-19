package Other;
import java.util.*;

public class Lab2_10 {
    public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the charge for food ");
             float food = sc.nextInt();
            double tax = .07 * food;
            double tip = .18 * food;
            double total = tax + food +tip;
            System.out.println("Tax: $" + tax + " Tip: $" + tip + " Total: $" + total);
            // need to add a formating way in the system out
    }
}
