package bank;

public class Main {

    public static void main(String[] args) {

        Bank firstTennessee = new  Bank("First Tennessee Bank");
        firstTennessee.addBranch(new Branch("Chattanooga"));
        firstTennessee.addBranch(new Branch("Hixson"));
        firstTennessee.addBranch(new Branch("Chattanooga"));

        firstTennessee.addCustomerToBranch("Chattanooga", new Customer("Victor", 187.96));
        firstTennessee.addCustomerToBranch("Chattanooga", new Customer("Victor", 200.87));
        firstTennessee.addCustomerToBranch("Chattanooga", new Customer("Paul", 108.97));
        firstTennessee.addCustomerToBranch("Chattanooga", new Customer("Ruth", 987.69));
        firstTennessee.addCustomerTransaction("Chattanooga", "Paul", 201.97);
        firstTennessee.addCustomerTransaction("Chattanooga", "Paul", 302.96);
        firstTennessee.addCustomerTransaction("Chattanooga", "Henry", 189.96);


        firstTennessee.showBranchCustomers("Chattanooga", false);
        firstTennessee.showBranchCustomers("Chattanooga", true);


    }
}