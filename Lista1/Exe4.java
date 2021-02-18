import java.util.Random;

public class Exe4 {

	public static void main(String[] args) {

		int matriz[][] = new int [4][4];
		int soma = 0;
		int impar = 0;
		int div8 = 0;
		int impar3 = 0;
		int maior = 0;
		long fatorial = 1L;
		
		Random random = new Random();
		
		for(int x = 0; x < 4; x++) {

			for(int y = 0; y < 4; y++) {

				matriz[x][y] = (int) (random.nextGaussian()*10);
				
				if(matriz[x][y] >= 1 && matriz[x][y] <= 100 ) {
					soma += matriz[x][y];
				}
				
				if(matriz[x][y] >= 30 && matriz[x][y] <= 50){
					if(matriz[x][y] % 2 != 0) {
						impar += 1;
					}
				}
				
				if(matriz[x][y] % 8 == 0) {
					div8 += 1;
				}
				
				if(matriz[x][y] % 2 != 0) {
					if(matriz[x][y] % 3 == 0) {
						impar3 += 1;
					}
				}
				
				if(matriz[x][y] > maior) {
					maior = matriz[x][y];					
				}

			}

		}
		
		for(int x = 1; x <= maior; x++) {

			fatorial *= x;
			
		}
		
		System.out.println();
		System.out.printf("Soma dos valores de 1 a 100: %d", soma);
		System.out.println();
		System.out.printf("Quantidade de numeros impares entre 30 e 50: %d", impar);
		System.out.println();
		System.out.printf("Quantidade de numeros divisiveis por 8: %d", div8);
		System.out.println();
		System.out.printf("Quantidade de numeros impares divisiveis por 3: %d", impar3);
		System.out.println();
		System.out.printf("Maior numero: %d", maior);
		System.out.println();
		System.out.printf("Fatorial do maior numero: %d", fatorial);

	}

}