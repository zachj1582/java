package udemy_exercises.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");

        bank.addBranch("Wichita Falls");

        bank.addCustomer("Wichita Falls", "Zach", 4.89);
        bank.addCustomer("Wichita Falls", "Emily", 688.99);
        bank.addCustomer("Wichita Falls", "John", 236.72);

        bank.addBranch("Plano");
        bank.addCustomer("Plano", "Charlie", 200.00);

        bank.addCustomerTransaction("Wichita Falls", "Emily", 100.10);
        bank.addCustomerTransaction("Wichita Falls", "Emily", 282.62);
        bank.addCustomerTransaction("Wichita Falls", "John", 1200.62);

        bank.listCustomers("Wichita Falls", true);
        bank.listCustomers("Plano", true);

        bank.addBranch("Dallas");
        if(!bank.addCustomer("Dallas", "Jason", 800.66)) {
            System.out.println("Error Dallas branch does not exist");
        }
    }
}
