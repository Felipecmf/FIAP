import java.util.Scanner;
public class Exemplo_switch_case_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = input.next();

        switch (nome){
            case "FIAP":
            case "fiap":
            case "Fiap":
                System.out.println("Nome ok!");
                break;
            default:
                System.out.println("Nome inválido!");
        }
    }
}
