import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o último dígito da sua placa ?: ");
        int placa = scanner.nextInt();

        System.out.println("Dia da semana: ");
        int semana = scanner.nextInt();

        switch (semana) {
            case 1:
                if (placa == 1 || placa == 2) {
                    System.out.println("Seu veículo não pode circular na Segunda-feira");
                    }else {
                        System.out.println("Seu veículo pode rodar na Segunda-feira");
                    }
                    break;
            case 2:
                if (placa == 3 || placa == 4) {
                    System.out.println("Seu veículo não pode circular na Terça-feira");
                }else {
                    System.out.println("Seu veículo pode rodar na Terça-feira");
                }
                break;
                }
            case 3:
                if (placa == 5 || placa == 6) {
                System.out.println("Seu veículo não pode circular na Quarta-feira");
                } else {
                System.out.println("Seu veículo pode rodar na Quarta-feira");
                 }
                break;
            }
    }

