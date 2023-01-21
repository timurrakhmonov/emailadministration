package emailapp;
import java.util.*;

public class EmailApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //User Info
        System.out.println("Enter your first name: ");
        String fName = scanner.next();
        System.out.println("Enter last name: ");
        String lName = scanner.next();

        Email emailOne = new Email(fName, lName);
        int choice = -1;

        do{
            System.out.println("\n**********\nEnter your choice\n1. Show Info\n2. Change password\n3. Change mailbox capacity\n4. Set Alternate email\n" +
                    "5. Store data in file\n6. Read data from file\n7. Exit");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    emailOne.getEmployeeInformation();
                    break;
                case 2:
                    emailOne.setPassword();
                    break;
                case 3:
                    emailOne.setCapacity();
                    break;
                case 4:
                    emailOne.alternativeEmail();
                    break;
                case 5:
                    emailOne.storeFile();
                    break;
                case 6:
                    emailOne.readingFile();
                    break;
                case 7:
                    System.out.println("thank you for using app!");
                    break;
                default:
                    System.out.println("Invalid choice\nEnter a proper choice again");
            }

        } while(choice != 7);
    }

}
