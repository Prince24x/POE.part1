import java.util.Scanner ;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
     void main() {
         // Declarations
  /*
         Scanner sc = new Scanner(System.in);
         String username;
         String username2;
         String password;
         String password2;
         String phoneNumber;

         Login userLogin = new Login();
         //Prompting the user first name and surname
          userLogin.userInput();


         //Prompting the username from the user
         System.out.println("Please enter your username:");
         username = sc.nextLine();
         //Checking the conditions for the username
         userLogin.checkUserName(username);
         //Prompting the phone number from the user
         System.out.println("Please enter your phone number:");
         phoneNumber = sc.nextLine();

         //Checking the conditions for the phone number
         userLogin.checkCellPhoneNumber(phoneNumber);
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




           */
// Part 2 : Sending messages

         Scanner sc = new Scanner(System.in);

         int choice = 0;
         int numberOfMessages;

         Message message = new Message();

         while (choice != 3) {

             System.out.println("\nWelcome to QuickChat");
             System.out.println("1: Send message");
             System.out.println("2: Show recently sent messages");
             System.out.println("3: Quit");
             System.out.println("Please choose an option:");

             choice = sc.nextInt();
             sc.nextLine();

             if (choice == 1) {

                 System.out.println("How many messages do you want to send?");
                 numberOfMessages = sc.nextInt();
                 sc.nextLine();

                 for (int i = 0; i < numberOfMessages; i++) {
                     System.out.println("\nMessage: " + (i + 1));

                     message.createMessage(sc);
                     message.printMessage();
                     message.sentMessage(sc);
                 }

             } else if (choice == 2) {

                 System.out.println("Coming soon");

             } else if (choice == 3) {

                 System.out.println("Thank you for using QuickChat!");

             } else {

                 System.out.println("Invalid option. Please choose 1, 2 or 3.");
             }
         }


     }
