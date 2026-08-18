import java.util.*;

class PhoneBook {

    ArrayList<Contact> contacts = new ArrayList<>();

    void addContact(String name, String phone, String email) {
        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact Added Successfully.");
    }

    void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No Contacts Found.");
            return;
        }

        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Contact Not Found.");
    }

    void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();

        while (it.hasNext()) {
            Contact c = it.next();

            if (c.name.equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Contact Deleted.");
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    void updateContact(String name, String phone, String email) {

        for (Contact c : contacts) {

            if (c.name.equalsIgnoreCase(name)) {

                c.phone = phone;
                c.email = email;

                System.out.println("Contact Updated.");
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    void sortContacts() {

        Collections.sort(contacts, (a, b) ->
                a.name.compareToIgnoreCase(b.name));

        System.out.println("Contacts Sorted.");
    }
}