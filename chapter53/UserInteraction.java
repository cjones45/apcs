import java.util.Scanner;

public class UserInteraction
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner(System.in);
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry cubbard = new Pantry(goose, apple, rhub);
    int jamSelect = 0;




    while (jamSelect != -1) {
      System.out.println(cubbard + "Enter your selection (1, 2, or 3): ");
      jamSelect = scan.nextInt();

      if (jamSelect > 3) {
        System.out.println("That is not a jam jar.");
      } else {

        if (jamSelection == -1) {
          System.out.println("Goodbye");
          break;
          
        } else {

          System.out.println("Enter amount to spread: ");
          int amountSpread = scan.nextInt();
      
          cubbard.select(jamSelection);
          cubbard.spread(amountSpread);




          
        }
      }
    }

  }
}