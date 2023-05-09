package question1;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n####### QUESTION 1 #######");
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
                    System.out.print("Por favor, digite o número de funcionários que deseja cadastrar: ");
                    int numberOfEmployees = scan.nextInt();

                    if (numberOfEmployees < 0) {
                        System.out.println("\n****************************************************************\n");
                        System.out.println("Parece que você digitou um número negativo, vamos recomeçar!");
                        System.out.println("Para o programa realmente funcionar digite um número maior que 0!");
                        System.out.println("\n****************************************************************\n");
                    } else if (numberOfEmployees == 0) {
                        System.out.println("\n****************************************************************\n");
                        System.out.println("Parece que você digitou zero e não quer mais cadastrar funcionários");
                        System.out.println("Vamos voltar ao nosso menu então!");
                        System.out.println("\n****************************************************************\n");
                    } else {
                        System.out.println("\n****************************************************************\n");
                        System.out.println("Excelente vamos cadastrar esses " + numberOfEmployees + " funcionários");
                        System.out.println("\n****************************************************************\n");

                        // Declarando array que irá guardar os nomes dos funcionários
                        String[] nameOfEmployees = new String[numberOfEmployees];

                        // Declarando array que irá guardar o salário dos funcionários
                        double[] salaryOfEmployees = new double[numberOfEmployees];

                        // Declarando array que irá guardar o bonus ou o desconto dos funcionários
                        double[] bonusOrDiscountOfEmployees = new double[numberOfEmployees];

                        for (int i = 0; i < numberOfEmployees; i++) {
                            System.out.println("\nFuncionário nº " + (i + 1));

                            System.out.print("Nome do funcionário: ");
                            scan.nextLine();
                            String nameEmployee = scan.nextLine();
                            nameOfEmployees[i] = nameEmployee;

                            System.out.print("Salário do funcionário: ");
                            double salaryEmployee = scan.nextInt();
                            salaryOfEmployees[i] = salaryEmployee;

                            if (salaryEmployee <= 1000) {
                                bonusOrDiscountOfEmployees[i] = (salaryEmployee * 0.2);
                            } else if (salaryEmployee > 1000 && salaryEmployee <= 2000) {
                                bonusOrDiscountOfEmployees[i] = (salaryOfEmployees[i] * 0.10);
                            } else {
                                bonusOrDiscountOfEmployees[i] = (salaryEmployee * 0.10);
                            }
                        }

                        showInfoEmployees(numberOfEmployees, salaryOfEmployees, nameOfEmployees, bonusOrDiscountOfEmployees);
                    }
                    break;
                case 2:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\n****************** \nOpção inválida!!!\n******************");
            }
        } while (option != 2);
    }

    public static void showInfoEmployees(int numberOfEmployees, double[] salaryOfEmployees, String nameOfEmployees[], double[] bonusOrDiscountOfEmployees) {
        for (int i = 0; i < numberOfEmployees ; i++) {
            System.out.println("\nFuncionário nº " + (i+1));
    
            System.out.println("Nome do funcionário: " + nameOfEmployees[i]);
            System.out.println("Salário do funcionário: " + salaryOfEmployees[i]);
            System.out.println("Bonus / Desconto: " + bonusOrDiscountOfEmployees[i]);
            System.out.println("Salário liquído: " + (salaryOfEmployees[i] + bonusOrDiscountOfEmployees[i]));
        } 
    }
}
