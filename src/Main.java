import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int exit = 1;

        while(exit != 0) {

            System.out.println("*******************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]\n");
            System.out.println("1) Dólar ==> Peso argentino"); // USD -> ARS
            System.out.println("2) Peso argentino ==> Dólar"); // ARS -> USD
            System.out.println("3) Dólar ==> Real brasileiro"); // USO -> BRL
            System.out.println("4) Real brasileiro ==> Dólar"); // BRL -> USD
            System.out.println("5) Dólar ==> Peso colombiano"); // USD -> COP
            System.out.println("6) Peso colombiano ==> Dólar"); // COP -> USD
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida: ");
            System.out.println("*******************************************************");

            int option = scanner.nextInt();
            String currencyfrom = "";
            String currencyto = "";

            switch (option) {
                case 1:
                    currencyfrom = "usd";
                    currencyto = "ars";
                    break;
                case 2:
                    currencyfrom = "ars";
                    currencyto = "usd";
                    break;
                case 3:
                    currencyfrom = "usd";
                    currencyto = "brl";
                    break;
                case 4:
                    currencyfrom = "brl";
                    currencyto = "usd";
                    break;
                case 5:
                    currencyfrom = "usd";
                    currencyto = "cop";
                    break;
                case 6:
                    currencyfrom = "cop";
                    currencyto = "usd";
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
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