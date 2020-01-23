package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength=8;
    private String alternateEmail;

    // Constructor to recieve firstName and lastName
public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);

    // We can create a methode here, asking for the department - return department
    this.department = setDepartment();
    System.out.println("Department: "+this.department);

    // Call a method that generate a random password
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your password is: "+this.password);

}

    // Ask for department
private String setDepartment(){
    System.out.println("Department codes: \n1 for Sales \n2 for Development\n3 for Accounting\n0 for none\n Enter depertment code:");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();

    if(depChoice == 1){
        return "sales";
    }else if(depChoice == 2){
        return "dev";
    }else if(depChoice == 3){
        return "acct";
    }else if(depChoice == 0){
        return "";
    }
    return null;
}

    // Generate a random password
private  String randomPassword(int length){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
    char[] password = new char[length];
    for (int i=0; i< length;i++) {
        int rand = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);
    }
    //return String.valueOf(password);
   return new String(password);


}

    // Set mailbox capacity


    // Set the alternate email


    // Change the password

}
