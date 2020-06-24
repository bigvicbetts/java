package bank;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<bank.Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<bank.Customer>();
    }

    // Check to see if customer already exists
    private int customerExists(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }


    // Add new customer to customers list
    public boolean addCustomer(bank.Customer customer) {
        if (customerExists(customer.getName()) >= 0) { // If customer already exists in customers list...
            System.out.printf("%s already exists.\n", customer.getName());
            return false;
        }
        customers.add(customer);  // Otherwise, add customer to customers list.
        return true;
    }

    public boolean addTransaction(String customerName, double amount) { // If customer exists, process transaction.
        if (customerExists(customerName) >= 0) {
            customers.get(customerExists(customerName)).addTransaction(amount);
            return true;
        }
        System.out.printf("%s is not a customer at this branch.\n", customerName); // Otherwise, error out.
        return false;
    }

    public ArrayList<bank.Customer> getCustomers() {
        return this.customers;
    }

    public String getName() {
        return this.name;
    }

}
