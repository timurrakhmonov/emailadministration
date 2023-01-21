package emailapp;
import java.util.*;
import java.io.*;

public class Email {
    public Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int mailCapacity = 500;
    private String alternativeEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Employee: " + this.firstName + " " + this.lastName);
        //calling methods

    }

    private String generateEmail(){
        return this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + ".company.com";
    }

    private String setDepartment(){
        System.out.println("Department codes \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None");
        boolean flag = false;
        do {
            System.out.println("Enter you department ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    return "Sales";
                case 2:
                    return "Development";
                case 3:
                    return "Accounting";
                case 0:
                    return "None";
                default:
                    System.out.println("invalid choice please choose it again.");

            }
        }while(!flag);
        return null;
    }

    private String generatePassword(int length) {
        Random random = new Random();
        String capitalCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallCharacters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&?";
        String values = capitalCharacters + smallCharacters + numbers + symbols;
        String password = "";

        for(int i = 0; i < length; i++){
            password = password + values.charAt(random.nextInt(values.length()));
        }
        return password;
    }

    public void setPassword(){
        boolean flag = false;
        do{
            System.out.println("Do you want to change your password! (Y/N)");
            char choice = scanner.next().charAt(0);
            if(choice == 'Y' || choice == 'y'){
                flag = true;
                System.out.println("Enter current password: ");
                String temporary = scanner.next();
                if(temporary.equals(this.password)){
                    System.out.println("Enter new password:");
                    this.password = scanner.next();
                    System.out.println("Password changed successfully");
                } else {
                    System.out.println("Incorrect password!");
                }
            } else if(choice == 'N' || choice == 'n'){
                flag = true;
                System.out.println("Password changed option is cancelled!");
            } else {
                System.out.println("Enter a valid choice");
            }
        } while(!flag);
    }

    //set mailbox capacity method
    public void setCapacity(){
        System.out.println("Current capacity: " + this.mailCapacity + " MB");
        System.out.println("Enter new mailbox capacity: ");
        this.mailCapacity = scanner.nextInt();
        System.out.println("Mailbox capacity is successfully changed to " + this.mailCapacity);
    }

    //set alternative email
    public void alternativeEmail(){
        System.out.println("Enter new alternative email: ");
        this.alternativeEmail = scanner.next();
        System.out.println("Alternative email is set to " + this.alternativeEmail);
    }

    //Display user information
    public void getEmployeeInformation(){
        System.out.println(" New: " + this.firstName + " " + this.lastName);
        System.out.println(" Department: " + this.department);
        System.out.println(" Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("Mail Capacity: " + this.mailCapacity + " MB");
        System.out.println("Alternate mail: " + this.alternativeEmail);
    }
}

