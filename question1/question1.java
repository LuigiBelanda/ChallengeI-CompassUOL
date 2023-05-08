package question1;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("####### QUESTION 1 #######");
        System.out.println("Java program that aims to validate whether a given employee is entitled to a bonus.");

        int option;

        do {
            System.out.println("\nOpções do nosso programa: ");
            System.out.println("\n\t1 - Cadastrar funcionário(s)");
            System.out.println("\t2 - Sair do programa");
            System.out.print("\nOpção escolhida: ");

            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Opção 1");
                    break;
                case 2:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\n****************** \nOpção inválida!!!\n******************");
            }
        } while (option != 2);

    }
}
