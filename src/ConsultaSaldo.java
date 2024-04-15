import java.util.Scanner;

public class ConsultaSaldo {
    public static void main(String[] args) {
        String nome = "Natasha Oliveira";
        String data = "15/04/2024";
        double saldoBancario = 2500;
        System.out.println("***********************************************");
        System.out.print("Nome do Cliente: " + nome + "\n");
        System.out.print("Data da Transação: " + data + "\n");
        System.out.print("Saldo do Cliente: " + saldoBancario + "\n");
        System.out.println("***********************************************");

        int opcao = 0;


        String menu = ("Escolha sua opção:" + "\n" +
                "1. Saldo atual" + "\n" +
                "2. Transferência" + "\n" +
                "3. Depósito" + "\n" +
                "4. Sair");

        Scanner sc = new Scanner(System.in);


        while (opcao != 4) {
            System.out.print(menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é:" + saldoBancario);

        } else if (opcao == 2) {
            System.out.println("Qual valor deseja transferir?");
            double valor = sc.nextDouble();
            if (valor > saldoBancario) {
             System.out.println("Saldo insuficiente para transferir");
            } else {
                saldoBancario -= valor;
                System.out.println("Saldo atual: " + saldoBancario);
            }
        } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = sc.nextDouble();
                saldoBancario += valor;
                System.out.println("Saldo atual: " + saldoBancario);
            } else if (opcao != 4) {
                System.out.println("Opção Inválida");
            }
        }
    }
}
