package question3;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n####### QUESTION 2 #######");

        int option;

        do {
            System.out.println("\nOpções do nosso programa: ");
            System.out.println("\n\t1 - Responder perguntas");
            System.out.println("\t2 - Sair do programa");
            System.out.print("\nOpção escolhida: ");

            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("opção 1");
                    break;
                case 2:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\n****************** \nOpção inválida!!!\n******************");
            }
        } while (option != 2);

        scan.close();
    }
}
