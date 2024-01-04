package finaljv2;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Contact> addressBook = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.println("Address Book");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.println("-----------------------");
            n = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    displayContact();
                    break;
                case 4:
                    System.out.println("System exit");
                    break;
                default:
                    System.out.println("Invalid value, please choise from 1 to 4");
                    break;
            }
        } while (n != 4);
        scanner.close();
    }
    private static void addContact() {
        System.out.println("Enter the name ");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number: ");
        String phone = scanner.nextLine();
        Contact contact = new Contact(name, phone);
        addressBook.put(name, contact);
        System.out.println("Success");
    }

    private static void searchContact() {
        System.out.println("Enter the name need find: ");
        String name = scanner.nextLine();
        Contact contact = addressBook.get(name);
        if(contact != null) {
            System.out.println("Contact found");
            System.out.println(contact.getPhone());
        } else {
            System.out.println("Not found");
        }
    }

    private static void displayContact() {
        System.out.println("Address Book:");
        System.out.printf("%-15s %-15s\n", "Contact Name", "Phone Number");

        for (Contact contact : addressBook.values()) {
            System.out.printf("%-15s %-15s\n", contact.getName(), contact.getPhone());
        }
    }


}
