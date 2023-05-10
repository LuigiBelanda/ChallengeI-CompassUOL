package question2;

import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a mensagem para saber o sentimento que ela expressa: \n");
        System.out.println("Utilize os caracteres :-) ou :-( \n");
        String message = scanner.nextLine();

        System.out.println(message);

        message = sanitizeString(message);

        System.out.println(message);

        scanner.close();
    }

    public static String sanitizeString(String message) {
        message = message.trim();
        return message;
    }
}
