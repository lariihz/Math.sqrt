
import java.util.Scanner;


public class LISTA2 {
        public static void main(String[] args) {
            // Declaração das variáveis
            double raio, perimetro, area;

            // Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner (System.in);

            // Solicita que o usuário insira o raio do círculo
            System.out.print("Digite o raio do círculo: ");
            raio = scanner.nextDouble();

            // Calcula o perímetro do círculo
            perimetro = 2 * 3.14159 * raio;

            // Calcula a área do círculo
            area = 3.14159 * raio * raio;

            // Exibe o perímetro e a área do círculo
            System.out.println("a. Perímetro: " + perimetro);
            System.out.println("b. Área: " + area);

            // Fecha o scanner
            scanner.close();
        }
    }

