import java.util.Scanner;

public class PasswordChecker{



public static void main(String[] args){
    boolean digit = false;
    boolean checker = false;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter password: ");
    String inPassword = scan.nextLine();
    checker(inPassword);
}


    public String checker(String inPassword){
   
    if(inPassword.length() < 7){
        return("That password is not acceptable.");
    }else{
        checkerAnswer = true;
        checkDigit(inPassword);


    }



}
    public static boolean checkDigit(String inPassword){
    
    for(int i=0; i <= inPassword.length(); i++){
        char letter = inPassword.charAt(i);
        if(Character.isDigit(i)){
            digit = true;

        }

}
return digit;
}
}