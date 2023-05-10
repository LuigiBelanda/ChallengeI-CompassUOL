package question2;

import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n####### QUESTION 2 #######");

        String message;

        do {
            System.out.println("\n\nDigite a mensagem para saber o sentimento que ela expressa:");
            System.out.println("Utilize os caracteres :-) ou :-( para sabermos seus sentimentos");
            System.out.print("\nSua mensagem: ");
            message = scanner.nextLine();

            message = sanitizeString(message);

            if (message == null || message == "") {
                System.out.println("\n\n************************************\n");
                System.out.println("Por favor, digite alguma mensagem!");
                System.out.println("\n************************************");
            }
        } while (message == null || message == "");
        
        scanner.close();
    }

    public static String sanitizeString(String message) {
        message = message.trim();
        return message;
    }
}
