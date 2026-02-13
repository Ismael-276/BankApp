/**
 * The type Account.
 */
public class Account {
    private static int lastId = 0;
    private final int id = lastId++;
    private String firstName;
    private String lastName;
    private double balance;


    /**
     * Instantiates a new Account.
     */
    public Account(){

        firstName = "unknown";
        lastName = "unknown";
        balance = 0;

    }

    /**
     * Instantiates a new Account.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Account(String firstName, String lastName){
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Deposit.
     *
     * @param amount the amount
     */
    public void deposit(double amount){
        if(amount < 0)
            throw new IllegalArgumentException("Invalid amount: " + amount + "Must be greater than 0.");

    }

    /**
     * Withdrawal.
     *
     * @param amount the amount
     */
    public void withdrawal(double amount){
        if(amount < 0)
            throw new IllegalArgumentException("Invalid amount: " + amount + " Must be greater than 0.");
        else if(amount > balance)
            throw new IllegalArgumentException("Invalid amount: " + amount + " Cannot be greater than the account balance: "+ balance);
    }
    public String toString(){
        String name;
        name = firstName + lastName;
        return name;

    }
    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets last id.
     *
     * @return the last id
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * Sets last id.
     *
     * @param lastId the last id
     */
    public static void setLastId(int lastId) {
        Account.lastId = lastId;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty())
            throw new IllegalArgumentException("Invalid last name! Name can't be blank for id: " + id);
        else
            this.lastName = lastName;

    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty())
            throw new IllegalArgumentException("Invalid first name! Name can't be blank for id: " + id);
        else
            this.firstName = firstName;
    }
}
