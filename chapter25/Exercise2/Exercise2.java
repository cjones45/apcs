import java.util.Scanner;

public class Exercise2{
    public static void main(String[] args) {
        double n;
        double odds;
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the guests");
        n = scan.nextInt();

        for (int i = 365; i >= n; i--){
            odds = (i - 1/365);
            System.out.print(odds);
        }


    }
}