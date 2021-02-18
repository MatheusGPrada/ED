import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {

		int vetor[] = new int [5];
		int resultado[] = new int [5];
		Scanner scanner = new Scanner(System.in);
		
		for(int x = 0; x <= 4; x++) {

			System.out.println();
			System.out.println("Informe o valor para o calculo do fatorial: ");
			vetor[x] = scanner.nextInt();
			resultado[x] = calculaFatorial(vetor[x]);

		}

		for (int y = 0; y <= 4; y++) {
	
			System.out.printf("Valor informado: %d", vetor[y]);
			System.out.println();
			System.out.printf("Fatorial: %d", resultado[y]);
			System.out.println();

		}

	}
	
	public static int calculaFatorial(int valor) {		

		int fatorial = 1;

		for(int x = 1; x <= valor; x++) {

			fatorial *= x;
		}

		return fatorial;

	}	

}
