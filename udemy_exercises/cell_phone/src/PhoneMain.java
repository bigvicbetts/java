package cell_phone;

public class PhoneMain {


    public static void Main(String[] args) {

        phone.CellPhone victorPhone = new phone.CellPhone("111-111-1111");
        victorPhone.addContact("Fred", "222-222-2222");
        victorPhone.addContact("James", "333-333-3333");
        victorPhone.showContacts();

    }
}