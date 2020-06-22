package phone;

import java.util.ArrayList;

public class CellPhone {

    private ArrayList<phone.Contact> contacts;
    private String phoneNumber;

    public CellPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contacts = new ArrayList<phone.Contact>();
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
            System.out.printf("%s already exists in your contact list", contactName);
            return false;
        }
        this.contacts.add(new phone.Contact(contactName, phoneNumber));
        return true;
    }

    public boolean removeContact(String contactName) {
        if (contactExists(contactName) < 0) {
            System.out.printf("%s is not currently in your contact list", contactName);
            return false;
        }
        contacts.remove(contactExists(contactName));
        return true;
    }

    public void showContacts() {
        contacts.forEach(contact -> System.out.printf("%s: %s", contact.getName(), contact.getPhoneNumber()));
    }


}
