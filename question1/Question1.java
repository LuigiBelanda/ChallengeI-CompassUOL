package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n####### QUESTION 1 #######");

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
                            String nameEmployee;

                            System.out.println("\nFuncionário nº " + (i + 1));

                            do {
                                scan.nextLine();
                                System.out.print("Nome do funcionário: ");
                                nameEmployee = scan.nextLine();

                                if (nameEmployee == null || nameEmployee == "") {
                                    System.out.println("\nPor favor, digite algum nome!\n");
                                }
                                
                            } while (nameEmployee == null || nameEmployee == "");
                            
                            nameOfEmployees[i] = nameEmployee;

                            System.out.print("Salário do funcionário: ");
                            double salaryEmployee = scan.nextDouble();
                            salaryOfEmployees[i] = salaryEmployee;

                            bonusOrDiscountOfEmployees[i] = calculateBonusOrDiscount(salaryEmployee);
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

        scan.close();
    }

    /**
     * 
     * Function name: calculateBonusOrDiscount
     * 
     * @param   salaryEmployee
     * @return  totalBonusOrDiscount (double)
     * 
     */
    public static double calculateBonusOrDiscount(double salaryEmployee) {
        double totalBonusOrDiscount;

        if (salaryEmployee <= 1000) {
            totalBonusOrDiscount = (salaryEmployee * 0.2);
        } else if (salaryEmployee > 1000 && salaryEmployee <= 2000) {
            totalBonusOrDiscount = (salaryEmployee * 0.10);
        } else {
            totalBonusOrDiscount = (salaryEmployee * 0.10);
        }

        return totalBonusOrDiscount;
    }

    /**
     * 
     * Function name: showInfoEmployees
     * 
     * @param numberOfEmployees
     * @param salaryOfEmployees
     * @param nameOfEmployees
     * @param bonusOrDiscountOfEmployees
     */
    public static void showInfoEmployees(int numberOfEmployees, double[] salaryOfEmployees, String nameOfEmployees[], double[] bonusOrDiscountOfEmployees) {
        System.out.println("\n\n\n****************************************************************\n");
        System.out.println("Resultado final dos dados cadastrados dos funcionários");
        System.out.println("E o salário final de cada um!");
        System.out.println("\n****************************************************************");
        
        for (int i = 0; i < numberOfEmployees ; i++) {
            System.out.println("\n\nFuncionário nº " + (i+1));
    
            System.out.println("Nome do funcionário: " + nameOfEmployees[i]);
            System.out.printf("Salário do funcionário: R$ %.2f", salaryOfEmployees[i]);

            if (salaryOfEmployees[i] > 2000) {
                System.out.printf("\nDesconto: R$ %.2f", bonusOrDiscountOfEmployees[i]);
                System.out.printf("\nSalário liquido: R$ %.2f", (salaryOfEmployees[i] - bonusOrDiscountOfEmployees[i]));
            } else {
                System.out.printf("\nBonus: R$ %.2f", (bonusOrDiscountOfEmployees[i]));
                System.out.printf("\nSalário liquido: R$ %.2f", (salaryOfEmployees[i] + bonusOrDiscountOfEmployees[i]));
            }            
        } 

        System.out.println("\n\n\n****************************************************************\n");
    }
}
