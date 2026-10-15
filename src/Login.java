import java.util.Scanner;
public class Login {
    String firstName;
    String lastName;
    String username2;
    String password2;

Scanner sc = new Scanner(System.in);
void userInput(){
    System.out.println("Please enter your first name:");
    firstName = sc.nextLine();
    System.out.println("Please enter your last name:");
    lastName = sc.nextLine();
}
//Method to check the username condition
boolean checkUserName(String username){
        while (true) {
            if (username.contains("_") && username.length() <= 5) {
                System.out.println("Username successfully captured");
                return true;
            } else {
                System.out.println("Username is not correctly formated; please " +
                        "ensure that " +
                        "your username contains " +
                        "an underscore" +
                        " and is no more than five characters in length");
                username = sc.nextLine();
            }
        }

}
// Method to check the cellphone number condition
boolean checkCellPhoneNumber(String phoneNumber) {
    while (true) {
        if (phoneNumber.startsWith("+27") && phoneNumber.length() <= 12) {
            System.out.println(" Cell phone number successfully added");
            return true;
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
            phoneNumber = sc.nextLine();

        }
    }

}
// Method to check the password conditions
boolean checkPasswordComplexity(String password){
    while (true) {
        boolean hasnumber = false;
        boolean hasCapital = false;
        boolean specialcharacter = false;
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
            return true;
        } else {
            System.out.println("Password is not correctly formatted , " +
                    "please ensure that the password " +
                    "contains at least " +
                    "eight character " +
                    ", a capital letter , a number and a special character");
            password = sc.nextLine();
        }
    }

}
// Method to check the login features

boolean loginUser(String username2 , String password2, String username , String password){
    while (true){
        if (username2.equals(username)&& password2.equals(password)){
            System.out.println("Welcome "+ firstName +" " + lastName + " it is great to see you again!");
            return true;
        } else{
            System.out.println("Username or password incorrect , please try again:");
            System.out.print("Username:");
            username2 = sc.nextLine();
            System.out.print("Password:");
            password2 = sc.nextLine();
        }
    }

}
}
