import java.util.Scanner ;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
     void main() {
         // Declarations
         String username;
         String username2;
         String password;
         String password2;
         String phonenumber;


         Scanner sc = new Scanner(System.in);
         //Prompting the user first name and surname
          Login userLogin = new Login();
          userLogin.userInput();


         //Prompting the username from the user
         System.out.println("Please enter your username:");
         username = sc.nextLine();
         //Checking the conditions for the username
         userLogin.checkUserName(username);
         //Prompting the phone number from the user
         System.out.println("Please enter your phone number:");
         phonenumber = sc.nextLine();

         //Checking the conditions for the phone number
         userLogin.checkCellPhoneNumber(phonenumber);
         //Prompting the password from the user
         System.out.println("Please enter your password:");
         password = sc.nextLine();

         //Checking the conditions for the password
        userLogin.checkPasswordComplexity(password);
         System.out.println("------------------Registration successful-----------------------");
         // Login part
         //Prompting the user for the login information
         System.out.println("Please login your details:");
         System.out.println("Username:");
         username2 = sc.nextLine();
         System.out.println("Password:");
         password2 = sc.nextLine();

         // Checking the conditions for the login
      userLogin.loginUser(username2 , password2 , username , password );
         System.out.println("----------------------Login Successful----------------------");
     }