import java.util.Scanner;

public class discountPrices{
    public static void main(String[] args) {
        double inPurchases;
        double finalprice = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cost :");
        inPurchases = scan.nextDouble();

        if (inPurchases > 10.0){    
            finalprice = ((inPurchases * .90));


        }

        System.out.println("The final price is: " + finalprice);



    }
}