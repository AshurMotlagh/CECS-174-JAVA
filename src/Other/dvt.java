package Other;
import java.util.Scanner;

public class dvt {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program calculates the distance time or velocity of an object in motion");
        System.out.println("In order to do so you will need to provide 2/3");
        System.out.print("******** menu ******** \n1 - Distance \n2 - Time \n3 - Velocity");
        int user = sc.nextInt();
        switch(user){
            case 1:
                System.out.print("Time traveled (seconds): ");
                int time = sc.nextInt();
                System.out.print("velocity of object (m/s): ");
                int velocity = sc.nextInt();

                System.out.println("distance is " + time*velocity+"m");
                break;
            case 2:
                System.out.print("Velocity of object (m/s): ");
                int vel = sc.nextInt();
                System.out.print("Distance traveled (m): ");
                int dis =sc.nextInt();

                System.out.println("time was" + dis/vel + "seconds");
                break;
            case 3:
                System.out.print("Time traveled (seconds): ");
                int t = sc.nextInt();
                System.out.print("Distance traveled (m): ");
                int d =sc.nextInt();

                System.out.println("Velocity is " + d/t + "m/s");
                break;
        }
    }

}
