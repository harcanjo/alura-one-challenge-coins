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
            System.out.println("7) Peso chileno ==> Dólar"); // CLP -> USD
            System.out.println("8) Dólar ==> Peso chileno"); // USD -> CLP
            System.out.println("9) Euro ==> Dólar"); // EUR -> USD
            System.out.println("10) Dólar ==> Euro"); // USD -> EUR
            System.out.println("11) Swiss Franc ==> Dólar"); // CHF -> USD
            System.out.println("12) Dólar ==> Swiss Franc"); // USD -> CHF

            System.out.println("0) Sair");
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
                    currencyfrom = "clp";
                    currencyto = "usd";
                    break;
                case 8:
                    currencyfrom = "usd";
                    currencyto = "clp";
                    break;
                case 9:
                    currencyfrom = "eur";
                    currencyto = "usd";
                    break;
                case 10:
                    currencyfrom = "usd";
                    currencyto = "eur";
                    break;
                case 11:
                    currencyfrom = "chf";
                    currencyto = "usd";
                    break;
                case 12:
                    currencyfrom = "usd";
                    currencyto = "chf";
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    exit = 0;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            ExchangeRate exchangeRate = new ExchangeRate();
            Currency currentExchangeRate = exchangeRate.getCurrentExchangeRate(currencyfrom, currencyto);
            double currentConversion = currentExchangeRate.conversionRate();

            System.out.println("Digite o valor que deseja converter: ");
            double valueToConvert = scanner.nextDouble();

            System.out.println("Valor " + valueToConvert +
                    " [" + currencyfrom.toUpperCase() + "] corresponde ao valor final de ==> " +
                    (valueToConvert * currentConversion) + " [" + currencyto.toUpperCase()+ "] ");
        }
    }
}