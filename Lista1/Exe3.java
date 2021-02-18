import java.util.Random;

public class Exe3 {

	public static void main(String[] args) {

		int vetor[] = new int[100];
		Random random = new Random();
		int numero = 1;
		int numero2 = 0;
		int aux = 0;
		
		for(int x = 0; x <= 99; x++) {

			vetor[x] = (int) (random.nextGaussian()*1000);			

		}
		
		for(int x = 0; x <= 99; x++) {

			for(int y = 1; y <= 98; y++) {

				if(vetor[x] < vetor[y]) {
					aux = vetor[x];
					vetor[x] = vetor[y];
					vetor[y] = aux;
				}

			}

		}

		for(int y = 0; y < 99; y++){

			if(vetor[y] > vetor[y + 1]){
				aux = vetor[y];
				vetor[y] = vetor[y+1];
				vetor[y+1] = aux;
			}

		}
		
			System.out.println("Os valores foram ordenados!!");
			
		for(int x = 0; x <= 99; x++) {	

			System.out.println(vetor[x]);

		}

	}

}
