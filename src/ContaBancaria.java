import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "Arthur";
        String tipoDeConta = "Conta Corrente";
        double saldo = 2700;

        System.out.println("---------------------------------");
        System.out.println("Dados do cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("---------------------------------");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\nOperações Bancarias ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.println("\nSelecione a opção desejada.");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nSaldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor a receber?");
                    double valorRecebido = input.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("\nSaldo atual: " + saldo);
                    break;
                case 3:
                    System.out.println("Qual valor deseja trasnferir?");
                    double ValorTrasnferido = input.nextDouble();
                    if (ValorTrasnferido > saldo) {
                        System.out.println("\nSaldo insuficiente para realizar a transferencia");
                        break;
                    }
                    saldo -= ValorTrasnferido;
                    System.out.println("\nSaldo atual: " + saldo);
                    break;
                case 4:
                    System.out.println("\nOperações finalizadas");
                    break;
                default:
                    System.out.println("\nOpção invalida, por favor digite uma opção valida");
            }
        }
    }
}
