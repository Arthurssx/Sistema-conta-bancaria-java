import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
   public static void main(String[] args) {
      int numeroGerado = new Random().nextInt(100);
      int tentativas = 0;
      int numeroDigitado = 0;
       Scanner leitura = new Scanner(System.in);

       System.out.println("||||||||JOGO DA ADIVINHAÇÃO|||||||");
       System.out.println("Um numero aleatório entre 0 e 100 foi gerado tente adivinhar em até 5 tentativas");

       while (tentativas < 5) {
           tentativas++;
           System.out.println("Tentativa numero " + tentativas);
           numeroDigitado = leitura.nextInt();

           if (numeroDigitado == numeroGerado) {
               System.out.println("Parabéns você acertou o numero com " + tentativas + " tentativas");
               break;
           } else  if (numeroDigitado < numeroGerado) {
               System.out.println("o numero gerado é maior que o seu palpite");
              } else {
               System.out.println("o numero gerado é menor que o seu palpite");
           }

       }
    if (tentativas == 5 && numeroDigitado != numeroGerado) {
        System.out.println("Infelizmente suas tentativas se esgotaram, o numero gerado era: " + numeroGerado);
    }

    leitura.close();

    }
}
