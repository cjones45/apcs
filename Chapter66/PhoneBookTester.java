import java.util.Scanner;

class PhoneEntry
{
  private String name;   
  private String phone;   

  public PhoneEntry( String n, String p )
  {
    name = n; phone = p;
  }
  
  public String getName()  {return name;}
  public String getPhone() {return phone;}
}

class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[ 5 ] ;

    phoneBook[0] = new PhoneEntry( "James johnothan", "(458) 565-5523" );
    phoneBook[1] = new PhoneEntry( "jim mean", "(243) 976-6544" );
  }

  public PhoneEntry search( String targetName )  
  {


    
    for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[ j] != null && phoneBook[ j ].getName().equals( targetName ) )
        return phoneBook[ j ];
    }

    return null;
  }
}

public class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();  
  


    Scanner scan = new Scanner(System.in);

    String name = " ";