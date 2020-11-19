package Week02;
import java.util.Scanner;

public class Lab_6_19 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String text = sc.nextLine();
        System.out.print("The new String is ");
        for(int i = text.length() - 1; i > -1; i--){
            if(text.charAt(i) == ' '){
                continue;
            }
            else
                System.out.print(text.charAt(i));
        }

    }
}