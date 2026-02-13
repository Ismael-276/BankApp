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
    public void deposit(double amount){
        if(amount < 0)
            throw new IllegalArgumentException("Invalid amount: " + amount + "Must be greater than 0.");


    }
    public void withdrawal(double amount){
        if(amount < 0)
            throw new IllegalArgumentException("Invalid amount: " + amount + "Must be greater than 0.");
        else if(amount > balance)
            throw new IllegalArgumentException("Invalid amount: " + amount + "Cannot be greater than the account balance: "+ balance);



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
        if (lastName == null || lastName.isEmpty())
            throw new IllegalArgumentException("Invalid last name! Name can't be blank for id: " + id);
        else
            this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty())
            throw new IllegalArgumentException("Invalid first name! Name can't be blank for id: " + id);
        else
            this.firstName = firstName;    }
}
