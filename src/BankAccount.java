public class BankAccount {
    private String accountNumber;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private double accountBalance;

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean depositFund(double amount){
        if(amount > 0) {
            this.accountBalance += amount;
            System.out.println("Amount of "+ amount + " deposited successfully, New balance is: " + this.accountBalance);
            return true;
        }
        System.out.println("Deposit Unsuccessful.");
        return false;
    }

    public boolean withdrawFund(double amount){
        if(amount > 0 && this.accountBalance >= amount){
            this.accountBalance -= amount;
            System.out.println("Amount of "+ amount + " withdrawn successfully, New balance is: " + this.accountBalance);
            return true;
        }
        System.out.println("Withdrawal Unsuccessful.");
        return false;
    }

}
