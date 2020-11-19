package Week01;
import java.util.*;

public class Lab_2_9 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        float num1 = sc.nextInt();
        float calc = ((num1*9) / 5 + 32);
        System.out.println(calc);
    }
}