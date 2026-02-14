package homework.leson5;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;
    private boolean isPremium;
    public BankAccount(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean isPremium() {
        if(balance >= 100000) {
            isPremium = true;
        }
        else isPremium = false;
        return isPremium;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }
    public void  transfer(BankAccount targetAccount, double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            targetAccount.balance += amount;
        }
    }
    @Override
    public String toString(){
        return "Номер счета: " + accountNumber + "\n" + "Баланс: " + balance + "\n" + "Имя владельца: " + ownerName + "\n" + "Премиум статус: " + isPremium + "\n";
    }

}
