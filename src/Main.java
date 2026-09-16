import java.util.Scanner ;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
     void main() {
         // Declarations
         String username;
         String password;
         String password2;
         String phonenumber;
         String firstName;
         String firstName1;
         String lastName;
         String lastName2 = "";
         boolean hasCapital = false;
         boolean hasnumber = false;
         boolean specialcharacter = false;
         Scanner sc = new Scanner(System.in);
         //Prompting the user first name and surname
         System.out.println("Please enter your first name");
         firstName = sc.nextLine();
         System.out.println("Please enter your surname");
         lastName = sc.nextLine();

         //Prompting the username from the user
         System.out.println("Please enter your username");
         username = sc.nextLine();
         //Checking the conditions for the username
         while (true) {

             if (username.contains("_") && username.length() <= 6) {
                 System.out.println("Username successfully captured");
                 break;
             } else {
                 System.out.println("Username is not correctly formated; please " +
                         "ensure that " +
                         "your username contains " +
                         "an underscore" +
                         " and is no more than five characters in length");
                 username = sc.nextLine();
             }
         }
         //Prompting the phone number from the user
         System.out.println("Please enter your phone number:");
         phonenumber = sc.nextLine();

         //Checking the conditions for the phone number
         while (true) {
             if (phonenumber.startsWith("+27") && phonenumber.length() <= 11) {
                 System.out.println(" Cell phone number successfully added");
                 break;
             } else {
                 System.out.println("Cell phone number incorrectly formatted or does not contain international code");
                 phonenumber = sc.nextLine();
             }
         }
         //Prompting the password from the user
         System.out.println("Please enter your password:");
         password = sc.nextLine();

         //Checking the conditions for the password
         while (true) {
             hasnumber = false;
             hasCapital = false;
             specialcharacter = false;
             for (char c : password.toCharArray()) {
                 if (Character.isDigit(c)) {
                     hasnumber = true;
                 }
                 if (Character.isUpperCase(c)) {
                     hasCapital = true;
                 }
                 if (!Character.isLetterOrDigit(c)) {
                     specialcharacter = true;
                 }
             }
             if (hasnumber && hasCapital && specialcharacter && password.length() >= 8) {
                 System.out.println("Password successfully captured");
                 break;
             } else {
                 System.out.println("Password is not correctly formatted , " +
                         "please ensure that the password " +
                         "contains at least " +
                         "eight character " +
                         ", a capital letter , a number and a special character");
                 password = sc.nextLine();
             }
         }
         // Login part
         System.out.println("Please enter your details");
         System.out.println("First name:");
         firstName1 = sc.nextLine();
         System.out.println("Last name:");
         lastName2 = sc.nextLine();
         System.out.println("Password:");
         password2 = sc.nextLine();
         while (true){
             if (firstName1.matches(firstName)&& lastName2.matches(lastName)&& password2.matches(password)){
                 System.out.println("Welcome "+ firstName1 +" " + lastName2 + " it is great to see you again!");
                 break;
             } else{
                 System.out.println("Username or password incorrect , please try again");
                 System.out.println("First name:");
                 firstName1 = sc.nextLine();
                 System.out.println("Last name:");
                 lastName2 = sc.nextLine();
                 System.out.println("Password:");
                 password2 = sc.nextLine();
             }
         }
     }