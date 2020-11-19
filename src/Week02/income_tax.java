package Week02;
import java.util.*;

public class income_tax {
    public static void main(String [] arg){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double num = sc.nextFloat();
        double tax;
        if(num <= 5000){
            tax = num * .01;
        }
        else if(num <= 75000){
            tax = 500 + (num - 50000)*.02;
        }
        else if (num <= 100000){
            tax = 1000 + (num - 75000) * .03;
        }
        else if (num <= 250000){
            tax = 1750 + (num - 100000) * .04;
        }
        else{
            tax = 2750 + (num - 250000) * .05;
        }
        System.out.println("The tax payable would be $ " + tax);
    }
}
