package cell_phone;

public class Main {


    public static void main(String[] args) {

        cell_phone.CellPhone victorPhone = new cell_phone.CellPhone("111-111-1111");
        victorPhone.startPhone();
        victorPhone.addContact("Fred", "222-222-2222");
        victorPhone.addContact("James", "333-333-3333");
        victorPhone.updateContact("James", "444-444-4444");
        victorPhone.removeContact("James");
        victorPhone.searchFor("Fred");
        victorPhone.showContacts();
        victorPhone.quitPhone();

    }
}