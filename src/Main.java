import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int exit = 1;

        while(exit != 0) {

            System.out.println("*******************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]\n");
            System.out.println("1) Dólar ==> Peso argentino");
            System.out.println("2) Peso argentino ==> Dólar");
            System.out.println("3) Dólar ==> Real brasileiro");
            System.out.println("4) Real brasileiro ==> Dólar");
            System.out.println("5) Dólar ==> Peso colombiano");
            System.out.println("6) Peso colombiano ==> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida: ");
            System.out.println("*******************************************************");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    exit = 0;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            System.out.println("Digite o valor que deseja converter: ");
            double valueToConvert = scanner.nextDouble();

            System.out.println("Valor " + valueToConvert +
                    " [" + option + "] corresponde ao valor final de ==> " +
                    valueToConvert * option + " [" + option+ "] ");
        }
    }
}