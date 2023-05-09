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
                    String nameUser;
                    int rights = 0, wrongs = 0;

                    do {
                        scan.nextLine();
                        System.out.print("\nNome do usuário: ");
                        nameUser = scan.nextLine();

                        if (nameUser == null || nameUser == "") {
                            System.out.println("\nPor favor, digite algum nome!\n");
                        }
                    } while (nameUser == null || nameUser == "");

                    System.out.println("\nVamos começar o quiz então " + nameUser + "!");

                    showInfosPlayer(rights, wrongs, nameUser);

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

    public static void showInfosPlayer(int rights, int wrongs, String nameUser) {
        System.out.println("\n****************************************************************\n");
        System.out.println("\tUsuário: \t" + nameUser);
        System.out.println("\tAcertos: \t" + rights);
        System.out.println("\tErros: \t\t" + wrongs);
        System.out.println("\n****************************************************************\n");
    }
}
