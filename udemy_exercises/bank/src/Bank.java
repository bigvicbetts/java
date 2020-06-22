package bank;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<bank.Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<bank.Branch>();
    }

    // See if branch exists
    private int branchExists(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addBranch(bank.Branch branch) {
        if (branchExists(branch.getName()) >= 0) { // If branch already exists in customers list...
            System.out.printf("%s branch already exists.\n", branch.getName());
            return false;
        }
        branches.add(branch);  // Otherwise, add branch to customers list.
        return true;
    }

    public boolean addCustomerToBranch(String branchName, bank.Customer customer) { // If branch exists in branches list...
        if (branchExists(branchName) >= 0) {
            branches.get(branchExists(branchName)).addCustomer(customer);
            return true;
        }
        System.out.printf("%s branch does not exist.\n", branchName); // Otherwise, error out.
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        if (branchExists(branchName) >= 0) {
            branches.get(branchExists(branchName)).addTransaction(customerName, amount);
            return true;
        }
        System.out.printf("%s branch does not exist.\n", branchName);
        return false;
    }

    public void showBranchCustomers(String branchName, boolean showTransactions) {
        ArrayList<bank.Customer> branchCustomers;
        if (branchExists(branchName) >= 0) {
            branchCustomers = branches.get(branchExists(branchName)).getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println(branchCustomers.get(i).getName());
                if (showTransactions == true) {
                    System.out.println(branchCustomers.get(i).getTransactions());
                }
            }
        }
        else {
            System.out.printf("%s branch does not exist.\n", branchName);
        }
    }

}


/*
**Banking w/ Java Classes**
   - **Bank class**
       - List of Branches
   - **Branch class**
     - List of Customers
     - List of Transactions
   - **Customer Class**:
     - Customer Name
   - **Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
   - **Bank:**
     - Add a new branch
     - Add a customer to that branch with initial transaction
     - Add a transaction for an existing customer for that branch
     - Show a list of customers for a particular branch and optionally a list of their transactions
   - Demonstration autoboxing and unboxing in your code
   - Think about where you are adding the code to perform certain actions
*/