package atm;

public class Main {
    public static void main(String[] args) {
//        Account BA1 = new Account(1,"Sara","S");
//        Account BA2 = new Account(2,"Josh","C",1000);
//
//        BA1.deposit(1800);
//        BA2.withdraw(199);
//
//        System.out.println(BA1.getName());
//        System.out.println("Account Balance: " + BA1.getBalance());
//        System.out.println("----------------------------------------");
//
//        System.out.println(BA2.getName());
//        System.out.println("Account Balance: " + BA2.getBalance());
//        System.out.println("----------------------------------------");
        Customer C1 = new Customer(1,10001,"Sara");
        Customer C2 = new Customer(2,10002,"Josh");

        System.out.println(C1.toString());
        System.out.println(C2.toString());

    }
}
