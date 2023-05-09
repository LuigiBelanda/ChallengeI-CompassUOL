package question3;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n####### QUESTION 3 #######");

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

                    String[][] arrayOfQuestionsAndAnswers = {
                        { "Questão 1 - AA", "V" },
                        { "Questão 1 - BB", "FLW" },
                        { "Questão 1 - CC", "F" },
                        { "Questão 1 - DD", "V" },
                    };

                    do {
                        scan.nextLine();
                        System.out.print("\nNome do usuário: ");
                        nameUser = scan.nextLine();

                        if (nameUser == null || nameUser == "") {
                            System.out.println("\nPor favor, digite algum nome!\n");
                        }
                    } while (nameUser == null || nameUser == "");

                    System.out.println("\nVamos começar o quiz então " + nameUser + "!");

                    for (int i = 0; i < arrayOfQuestionsAndAnswers.length; i++) {
                        String resposta;

                        System.out.println("\nQuestão " + (i + 1));
                        System.out.println(arrayOfQuestionsAndAnswers[i][0]);

                        do {
                            System.out.printf("Resposta - Questão %d: ", i + 1);
                            resposta = scan.nextLine();

                            // Tirando os espaços em branco das extremidades
                            resposta = resposta.trim();

                            if (resposta == null || resposta == "") {
                                System.out.println("\nPor favor, digite uma resposta!\n");
                            }
                        } while (resposta == null || resposta == "");

                        if (resposta.equals(arrayOfQuestionsAndAnswers[i][1])) {
                            System.out.println("\n****************************************************************\n");
                            System.out.println("\t\tVOCÊ ACERTOU! +1 em acertos");
                            System.out.println("\n****************************************************************\n");
                            rights++;
                        } else {
                            System.out.println("\n****************************************************************\n");
                            System.out.println("\t\tVocê ERROU! :( +1 em erros");
                            System.out.println("\n****************************************************************\n");
                            wrongs++;
                        }

                        showInfosPlayer(rights, wrongs, nameUser);
                    }

                    System.out.println("\n\n\n\n\n###################################################\n");
                    System.out.println("\t\tRESULTADO FINAL!");
                    showInfosPlayer(rights, wrongs, nameUser);
                    System.out.println("\n###################################################\n\n");

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
        System.out.println("\n\t\tUsuário: \t" + nameUser);
        System.out.println("\t\tAcertos: \t" + rights);
        System.out.println("\t\tErros: \t\t" + wrongs);
    }
}
