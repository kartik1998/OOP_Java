package Classes_and_Constructors;

public class Account {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String emailID;
    private long phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(long amount){
        this.balance = this.balance + amount;
        System.out.println("Amount updated!");
    }

    public void withdrawal(long amount){
        if(amount>this.balance){
            System.out.println("Sorry amount more than balance!");
        }else{
            this.balance -=amount;
            System.out.println("Withdrawal achieved!");
        }
    }



}
