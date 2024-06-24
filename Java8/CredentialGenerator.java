// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class CredentialGenerator {
    public static String RandomPassword() {
        String numbers = "0123456789";
        String Capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String special = "~!@#$%^&<>?/()={}[]";
        
        StringBuilder Password = new StringBuilder();
        for (int i=0; i<3; i++) {
            int random = (int)Math.floor(Math.random()*10);
            Password.append(numbers.charAt(random));
            Password.append(Capital.charAt(random));
            Password.append(small.charAt(random));
            Password.append(special.charAt(random));
        }
        
        return Password.toString();
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter Your first name : ");
        String firstName = scan.nextLine();
        System.out.print("Enter Your last name : ");
        String lastName = scan.nextLine();
        
        System.out.print("Choose Deparment:- \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal\n");
        int department = scan.nextInt();
        String Department = "";
        
        switch(department) {
            case 1: Department += "Technical";
                    break;
            case 2: Department += "Admin";
                    break;
            case 3: Department += "Human Resource";
                    break;
            case 4: Department += "Legal";
                    break;
            default: System.out.println("Enter valid Deparment(Choose from 1 to 4 only : ");
        }
        String Email = "";
        String Password = "";
        if (firstName != "" && lastName != "" && Department != "") {
            Email = firstName.toLowerCase()+lastName.toLowerCase()+Department.toLowerCase()+"@niet.co.in";
            Password += RandomPassword();
        }
        
        System.out.println("Your generated credentials are - \n");
        System.out.println("Email :- "+Email);
        System.out.println("Password :- "+Password);

        scan.close();
    }
}