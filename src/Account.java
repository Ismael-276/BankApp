public class Account {
    private static int lastId = 0;
    private final int id = lastId++;
    private String firstName;
    private String lastName;
    private double balance;


    public Account(){

        firstName = "unknown";
        lastName = "unknown";
        balance = 0;
    }
    public Account(String firstName, String lastName){
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public static int getLastId() {
        return lastId;
    }

    public static void setLastId(int lastId) {
        Account.lastId = lastId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
