package Math.sqrt;

public class ativ_14 {
    public class Main {
        public static void main(String[] args) {
            double numero = 50;

            double raizQuadrada = Math.sqrt(numero);

            double resultado = Math.round(raizQuadrada * 100.0) / 100.0;

            System.out.println("A raiz quadrada de " + numero + " é: " + resultado);
        }
    }
}