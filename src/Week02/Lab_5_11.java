package Week02;
import java.util.*;


public class Lab_5_11 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        if(num1 == num2 && num1 == num3){
            System.out.println("all the same");
        }
        else if(num1 != num2 && num1 != num3)
            System.out.println("all different");
        else
            System.out.println("neither");
    }
}