import java.util.Scanner;

public class nameEcho{
    
    String endName;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter name: ");
    String fullName = scan.nextLine();
    endName = split(fullName);
    System.out.print(endName);


    public static split(String fullName){
        name.trim();
        int n = fullName.indexOf(' ');
        String lastName = fullName.substring(n, fullname.length());
        lastName = lastName.toUpperCase();
        String firstName = fullName.substring(0, n);
        firstName = firstName.concat(lastName);
        return firstName;
    }
}