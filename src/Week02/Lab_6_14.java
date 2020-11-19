package Week02;

public class Lab_6_14 {
    public static void main(String [] arg) {
        int num = 1;
        int total = 1;
        while( num <= 1001){
            total = total + num;
            num += 3;
        }
        System.out.println(total);
    }
}
