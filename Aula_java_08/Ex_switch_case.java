import java.util.Scanner;
public class Ex_switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Número: ");
        int n = input.nextInt();

        switch (n) {
            case 1:
                System.out.println("Número 1: ");
                break;
            case 2:
                System.out.println("Número 2: ");
                break;
            case 3:
                System.out.println("Número 3: ");
                break;
            case 4:
                System.out.println("Número 4: ");
                break;
            case 5:
                System.out.println("Número 5: ");
                break;
            default:
                System.out.println("Número inválido: ");
        }



    }
}
