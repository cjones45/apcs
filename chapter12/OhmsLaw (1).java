import java.util.Scanner;


public class OhmsLaw
{
    public static void main ( String[] args )
    {
        int inRes;
        int inVol;
        double zero = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the voltage: ");
        inVol = scan.nextInt();
        System.out.println("Input the resistance: ");
        inRes = scan.nextInt();
        


        System.out.println("I = " + ((inVol + zero)/inRes));

    }

}