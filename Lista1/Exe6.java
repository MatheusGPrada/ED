import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {

		int valor = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor para calculo do fatorial");
		valor = scanner.nextInt();
		
		System.out.println(calculaFatorial(valor));
		
	}
	
	
	private static int calculaFatorial(int valor) {

		if (valor == 0) {
			return 1;
		} else {
			return valor*calculaFatorial(valor-1);
		}

	}

}




