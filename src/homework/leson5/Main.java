package homework.leson5;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("000001" , "Peter" , 5999900.36);
        BankAccount ba1 = new BankAccount("000002" , "Katya" , 238.25);
        System.out.println(ba.getBalance());
        ba.deposit(100);
        System.out.println(ba.getBalance());
        ba.withdraw(65.2);
        System.out.println(ba.getBalance());
        System.out.println(ba1.getBalance());
        ba.transfer(ba1 , 500);
        System.out.println(ba.getBalance());
        System.out.println(ba1.getBalance());
        ba.isPremium();
        System.out.println(ba);
    }
}
