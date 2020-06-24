package cell_phone;

import java.util.ArrayList;

public class CellPhone {

    private ArrayList<cell_phone.Contact> contacts;
    private String phoneNumber;

    public CellPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contacts = new ArrayList<cell_phone.Contact>();
    }

    // Checks to see if contact already exists in contact list
    private int contactExists(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addContact(String contactName, String phoneNumber) {
        if (contactExists(contactName) >= 0) {
            System.out.printf("%s already exists in your contact list\n", contactName);
            return false;
        }
        this.contacts.add(new cell_phone.Contact(contactName, phoneNumber));
        return true;
    }

    public boolean removeContact(String contactName) {
        if (contactExists(contactName) < 0) {
            System.out.printf("%s is not currently in your contact list\n", contactName);
            return false;
        }
        contacts.remove(contactExists(contactName));
        return true;
    }

    public void showContacts() {
        contacts.forEach(contact -> System.out.printf("%s: %s\n", contact.getName(), contact.getPhoneNumber()));
    }

    public void searchFor(String contactName) {
        if (contactExists(contactName) < 0) {
            System.out.printf("%s is not currently in your contact list.\n", contactName);
        }
        else {
            System.out.printf("%s: %s\n", contactName, contacts.get(contactExists(contactName)).getPhoneNumber());
        }
    }

    public void updateContact(String contactName, String phoneNumber) {
        if (contactExists(contactName) < 0) {
            System.out.printf("%s is not currently in your contact list.\n", contactName);
        }
        else {
            contacts.get(contactExists(contactName)).setPhoneNumber(phoneNumber);
        }
    }

    public void startPhone() {
        System.out.println("Phone is starting...");
    }

    public void quitPhone() {
        System.out.println("Phone is quitting...");
    }
}
