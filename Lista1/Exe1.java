import java.util.Random;

public class Exe1 {

	public static void main(String[] args) {

		double vetor[] = new double [100];
		Random numero = new Random();
		double negativos = 0;
		double positivos = 0;
		double geral = 0;
		double count = 0;
		
		for(int x = 0; x <= 99; x++) {
			
			vetor[x] = numero.nextGaussian() * 1000;
			
			if(vetor[x] >= 100 && vetor[x] <= 1000) {
				positivos += vetor[x];
				count++;
			}
			
			if(vetor[x] < 0) {
				negativos += vetor[x];
			}

			geral += vetor[x];

		}
		
		positivos = positivos/count;
		geral = geral/100;
		
		System.out.printf("Media positivos entre 100 e 1000: %f", positivos);		
		System.out.printf("Media geral dos valores: %f", geral);
		System.out.printf("Soma saldos negativos: %f", negativos);

	}

}
