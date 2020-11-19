package Other;
import java.util.*;

public class Lab3_11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        int age = sc.nextInt();
        age = age * 365;
        System.out.println("Converting your age into days --> " + age);
    }
}
