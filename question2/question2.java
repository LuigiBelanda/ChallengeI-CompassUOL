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
        
        showSentiment(message);

        scanner.close();
    }

    /**
     * Function name: sanitizeString
     * 
     * @param message
     * @return
     */
    public static String sanitizeString(String message) {
        // trim() - remove os espaços em branco do início e do fim da String
        message = message.trim();
        return message;
    }

    /**
     * Function name: showSentiment
     * 
     * @param message
     */
    public static void showSentiment(String message) {
        int fun = 0;
        int upset = 0;

        // message.lenght() - 2
        // -2 (por que como estamos pegando 2 caracteres a frente do index 'i'
        // Se deixarmos apenas o message.lenght será lançada uma exceção
        // Mostrando que não tem mais nada na String e o código para
        // Pois nosso código irá até a última letra se deixarmos apenas message.lenght() e depois o c2 e c3
        // Não iram pegar nada e irá ser lançada a exceção comentada anteriormente)
        for (int i = 0; i < message.length() - 2; i++) {
            char c1 = message.charAt(i);
            char c2 = message.charAt(i+1);
            char c3 = message.charAt(i+2);

            // System.out.printf("\nC1 %s - C2 %s - C3 %s", c1, c2, c3);
    
            if (c1 == ':' && c2 == '-' && c3 == ')') {
                fun++;
            } else if (c1 == ':' && c2 == '-' && c3 == '(') {
                upset++;
            }
        }
    
        System.out.printf("\nCarinhas felizes: %d ---- Carinhas tristes: %d\n", fun, upset);
        
        if (fun > upset) {    
            System.out.println("\nTemos mais carinhas felizes do que tristes");
            System.out.println("Resultado: Fun!");
        } else if (upset > fun) {
            System.out.println("\nTemos mais carinhas tristes do que felizes");
            System.out.println("Resultado: Upset!");
        } else {
            System.out.println("\nO número de carinhas felizes e tristes é igual ou nem tinha na mensagem carinhas!");
            System.out.println("Resultado: Neutral!");
        }
    }
    
}
