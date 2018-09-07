import java.util.Scanner;

public class check{
    public static void main(String[] args) {
        double inCheckingvalue;
        double inSavingsvalue;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your ballance of checking:");
        inCheckingvalue = scan.nextInt();
        System.out.println("Enter youre ballance savings:");
        inSavingsvalue = scan.nextInt();
        
        if (inCheckingvalue > 1000 || inSavingsvalue > 1500){
            System.out.println("Service charge: $0.0");
        }else{
            System.out.println("Service charge: $0.0");

           


        }




    }
}