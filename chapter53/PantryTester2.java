public class PantryTester2
{
  public static void main ( String[] args )
  {
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );

    Pantry cubbard = new Pantry( goose, apple );
    System.out.println(cubbard);

    if ( cubbard.select(1) )
      cubbard.spread(2);
    else
      System.out.println("Selection not available");
    System.out.println( cubbard );

    if ( cubbard.select(3) )
      cubbard.spread(5);
    else
      System.out.println("Selection not available");
    System.out.println( cubbard );

  }
}