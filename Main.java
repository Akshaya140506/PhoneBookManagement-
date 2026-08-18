
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PhoneBook pb = new PhoneBook();

        while (true) {

            System.out.println("\n===== PHONEBOOK MANAGEMENT =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Sort Contacts");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    pb.addContact(name, phone, email);
                    break;

                case 2:
                    pb.viewContacts();
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    pb.searchContact(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();

                    System.out.print("New Phone: ");
                    String p = sc.nextLine();

                    System.out.print("New Email: ");
                    String e = sc.nextLine();

                    pb.updateContact(n, p, e);
                    break;

                case 5:
                    System.out.print("Enter Name: ");
                    pb.deleteContact(sc.nextLine());
                    break;

                case 6:
                    pb.sortContacts();
                    break;

                case 7:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}