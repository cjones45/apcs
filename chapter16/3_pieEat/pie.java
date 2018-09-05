import java.util.Scanner;

public class pie{
    public static void main(String[] args) {
        double inWeight;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your weight :");
        inWeight = scan.nextDouble();

        if (inWeight >= 280 && inWeight <= 220) {    
            System.out.println("You can enter this contest");


        }else{  
            System.out.println("You can NOT enter this contest");


        }

       



    }
}