import java.util.Scanner;

public class SimpleAICommunicationSystem {

    // Method to process user input and generate responses
    public static String getResponse(String input) {
        input = input.toLowerCase().trim();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I assist you today?";
        } else if (input.contains("how are you")) {
            return "I'm just a program, but I'm doing great! How about you?";
        } else if (input.contains("bye") || input.contains("goodbye")) {
            return "Goodbye! Have a great day!";
        } else if (input.contains("name")) {
            return "I am an AI communication system.";
        } else if (input.contains("time")) {
            return "The current time is: " + java.time.LocalTime.now().toString();
        } else {
            return "Sorry, I didn't understand that. Can you please rephrase?";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        
        System.out.println("Welcome to the AI Communication System!");
        System.out.println("Type 'bye' to exit.");

        // Continuously take input from the user until they type 'bye'
        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine();
            
            if (userInput.toLowerCase().equals("bye")) {
                System.out.println("AI: Goodbye! Have a great day!");
                break;
            }

            // Get AI response
            String response = getResponse(userInput);
            System.out.println("AI: " + response);
        }
        
        scanner.close();
    }
}
