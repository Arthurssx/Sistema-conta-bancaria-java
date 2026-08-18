import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Calcular a área da circuferência");
        System.out.println("2. Calcular a área da quadrado");
        System.out.println("Escolha uma das opções (1 ou 2)");
        int area = input.nextInt();
        if (area == 1) {
            System.out.println("Digite o raio da circuferencia");
            double raio = input.nextDouble();
            double areaDaCircuferencia = Math.PI * raio * raio;
            System.out.println("O resultado da operação é: %.2f" .formatted(areaDaCircuferencia));
        } else if (area == 2) {
            System.out.println("Digite o valor do lado do quadrado");
            double lado = input.nextDouble();
            double areaDoQuadrado = lado * lado;
            System.out.println("O resultado da operação é: %.2f"  .formatted(areaDoQuadrado));
        } else {
            System.out.println("Opção invalida");
        }

    }
}
