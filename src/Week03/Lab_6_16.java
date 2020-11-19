package Week03;

import java.util.Scanner;

public class Lab_6_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("******** menu ******** \n1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division \n5 - Exit");
            System.out.print("Please select the operation: ");
            int operation = sc.nextInt();
            if(operation < 1 || operation > 4)
                break;
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            int result = 0;
            switch (operation) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
            }
            System.out.println("The result is " + result);
        }
        System.out.println("Goodbye");
    }
}