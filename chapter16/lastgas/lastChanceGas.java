import java.util.Scanner;

public class lastChanceGas{
    public static void main(String[] args) {
        double inCapacity;
        double inFuelIndication;
        double inMilesPerGallon;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the fuel capacity:");
        inCapacity = scan.nextDouble();
        System.out.println("Enter the fuel indication:");
        inFuelIndication = scan.nextDouble();
        System.out.println("Enter the MPG :");
        inMilesPerGallon = scan.nextDouble();

        if ((inMilesPerGallon * ((inFuelIndication * inCapacity) / 100)) < 200){    
            System.out.println("bruh Get gas");


        }else{
            System.out.println("naw fam u good");
        }

        



    }
}