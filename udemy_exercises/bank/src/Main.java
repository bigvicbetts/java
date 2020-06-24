package bank;

public class Main {

    public static void main(String[] args) {

        bank.Bank firstTennessee = new bank.Bank("First Tennessee Bank");
        firstTennessee.addBranch(new bank.Branch("Chattanooga"));
        firstTennessee.addBranch(new bank.Branch("Hixson"));
        firstTennessee.addBranch(new bank.Branch("Chattanooga"));

        firstTennessee.addCustomerToBranch("Chattanooga", new bank.Customer("Victor", 187.96));
        firstTennessee.addCustomerToBranch("Chattanooga", new bank.Customer("Victor", 200.87));
        firstTennessee.addCustomerToBranch("Chattanooga", new bank.Customer("Paul", 108.97));
        firstTennessee.addCustomerToBranch("Chattanooga", new bank.Customer("Ruth", 987.69));
        firstTennessee.addCustomerTransaction("Chattanooga", "Paul", 201.97);
        firstTennessee.addCustomerTransaction("Chattanooga", "Paul", 302.96);
        firstTennessee.addCustomerTransaction("Chattanooga", "Henry", 189.96);


        firstTennessee.showBranchCustomers("Chattanooga", false);
        firstTennessee.showBranchCustomers("Chattanooga", true);


    }
}