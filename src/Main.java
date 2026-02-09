//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Account a1 = new Account();
        Account a2 = new Account("Ismael", "Ramirez");
        System.out.println(a1.getFirstName());
        System.out.println(a1.getLastName());
        System.out.println(a2.getFirstName());
        System.out.println(a2.getLastName());

    }

}