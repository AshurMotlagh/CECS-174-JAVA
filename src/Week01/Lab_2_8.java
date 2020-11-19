package Week01;
import java.util.*;


public class Lab_2_8 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is "+sum);
        int diff = num1 - num2;
        if(num1 > num2){
            System.out.println("The distance is "+ diff * -1);
        }
         else{
            System.out.println("The distance is "+ diff);
        }
         int prod = num1 * num2;
        System.out.println("The product is "+ prod);

    }
}
