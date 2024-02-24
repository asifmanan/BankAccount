public class App {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("Asif M.");
        bankAccount.setCustomerEmail("asifmanan@gmail.com");
        bankAccount.setAccountNumber("007");
        bankAccount.setCustomerPhone("03008985777");

        boolean success = bankAccount.depositFund(100);
        success = bankAccount.withdrawFund(50);
        success = bankAccount.withdrawFund(50);
        bankAccount.withdrawFund(0.6);

    }
}
