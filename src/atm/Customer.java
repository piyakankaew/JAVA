package atm;

public class Customer {
    private int CustomerNo;
    private int pin;
    private String name;
    private Account acc;

    public Customer(int customerNo, int pin, String name) {
        CustomerNo = customerNo;
        this.pin = pin;
        this.name = name;
        this.acc = new Account(customerNo,name,"S");
    }

    public int getCustomerNo() {
        return CustomerNo;
    }

    public String getName() {
        return name;
    }

    public Account getAcc() {
        return acc;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerNo=" + CustomerNo +
                ", name='" + name + '\'' +
                ", acc=" + acc +
                '}';
    }

    public boolean match(int inputPin){
        return pin == inputPin;
    }
}
