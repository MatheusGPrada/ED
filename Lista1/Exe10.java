import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {

        int valor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero da sequencia de Fibonacci: ");
        valor = scanner.nextInt();
        System.out.println();

        System.out.printf("%d ", calculaFibonacci(valor, 1, 0)); 

	}

    private static int calculaFibonacci(int valor, int n1, int n2) {

        System.out.printf("%d ",n2);
        System.out.println();
        int fibonacci = 0;
        fibonacci = n1 + n2;

        if (fibonacci < valor) {
            n2 = n1;
            n1 = fibonacci;
            return calculaFibonacci(valor, n1, n2);
        } else {
            System.out.printf("%d ",n1);
            System.out.println();
            return fibonacci;
        }

    }  

}
