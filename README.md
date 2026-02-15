# How the program Works
## Classes
 - Account - An object that stores the name, id, and balance.
   - Deposit Method - Gets amount and adds to the balance, validates input by throwing error and displaying a message if the input is invalid.
   - Withdrawal Method - Gets amount and takes away from the balance. Also validates input.
   - Getter/Setters - Validates input and just stores input.
 - BankApp - The program that the user interacts with.
   - Main() - Contains displayAppHeader() which prints the lines and createAccount() which forces account creation before anything else.
   - CreateAccount() - Continuosly loops until user enters a valid first and last name and prints account a message when a valid first and last name are inputted.
   - Main menu loop - Uses a while loop to display a menu in which the user enters d, w, or q. This loop allows the use of upper and lower case for input. When q is selected it breaks the loop and ends the program.
## New Concepts
 - Override - Essentially overrides the default object that prints in a toString with what you have inside the method.
 - Generating setters/getters - Using the compiler to have it generate code for me
 - Generating javadocs - Same concepts as the setters/getters but the only difference is that you have to install a program that allows the generation of javadocs.
 - Throwing errors - Adding errors inside the setters to validate input and send out a message with invalid input.
## Screenshot of Output
!("C:\Users\Ismae\OneDrive\Pictures\Screenshots\Screenshot 2026-02-15 174409.png")
