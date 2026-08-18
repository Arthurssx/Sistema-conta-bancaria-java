import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero e iremos calcular o fatorial deste numero");
        int numero = input.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.println("o resultado da expressão é: " + fatorial);
    }
}
