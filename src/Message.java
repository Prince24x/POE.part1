
import java.util.Scanner;
import java.util.Random;

public class Message {

    String messageID;
    int messageNumber;
    String recipient;
    String messageText;
    String messageHash;
    String status;

    int totalMessagesSent = 0;
    int nextMessageNumber = 1;

    Random random = new Random();

    // Generate a 10-digit message ID
    void checkMessageID() {
        long id = 1000000000L + random.nextLong(9000000000L);
        messageID = String.valueOf(id);
    }

    // Create a message
    void createMessage(Scanner sc) {

        checkMessageID();

        messageNumber = nextMessageNumber;
        nextMessageNumber++;

        // Enter recipient number
        while (true) {
            System.out.println("Enter recipient number starting with +27:");
            recipient = sc.nextLine();

            if (recipient.startsWith("+27")
                    && recipient.length() <= 10
                    && recipient.length() > 3
                    && recipient.substring(3).matches("[0-9]+")) {

                break;

            } else {
                System.out.println("Invalid recipient number. Try again.");
            }
        }

        // Enter message
        while (true) {
            System.out.println("Enter your message (maximum 250 characters):");
            messageText = sc.nextLine();

            if (messageText.length() <= 250) {
                break;
            } else {
                System.out.println("Message is too long. Try again.");
            }
        }

        createMessageHash();
        status = "Pending";
    }

    // Create message hash
    void createMessageHash() {

        String[] words = messageText.trim().split("\\s+");

        messageHash = messageID.substring(0, 2)
                + ":" + messageNumber
                + ":" + words[0].toUpperCase()
                + words[words.length - 1].toUpperCase();
    }

    // Display message details
    void printMessage() {

        System.out.println("\n----- Message Details -----");
        System.out.println("Message ID: " + messageID);
        System.out.println("Message Number: " + messageNumber);
        System.out.println("Recipient: " + recipient);
        System.out.println("Message: " + messageText);
        System.out.println("Message Hash: " + messageHash);
    }

    // Choose what to do with the message
    void sentMessage(Scanner sc) {

        int option = -1;

        while (option != 1 && option != 0 && option != 2) {

            System.out.println("\n1: Send message");
            System.out.println("0: Disregard message");
            System.out.println("2: Store message to send later");
            System.out.println("Choose an option:");

            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {

                status = "Sent";
                totalMessagesSent++;

                System.out.println("Message successfully sent.");

            } else if (option == 0) {

                status = "Disregarded";

                System.out.println("Message deleted.");

            } else if (option == 2) {

                status = "Stored";

                System.out.println("Message successfully stored.");

            } else {

                System.out.println("Invalid option. Try again.");
            }
        }
    }

    // Return total messages sent
    int returnTotalMessage() {
        return totalMessagesSent;
    }
}
