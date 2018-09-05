import java.util.Scanner;

public class AAC{
    public static void main(String[] args) {
        double inCost;
        int inHours;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cost: ");
        inCost = scan.nextInt();
        System.out.println("Enter the hours: ");
        inHours = scan.nextInt();

        System.out.println("Annual Appliance cost: " + ((inCost / 100) * inHours));



    }
}