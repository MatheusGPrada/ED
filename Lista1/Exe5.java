import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {

		int matriz[][] = new int [4][4];
		int diagonal = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(int x = 0; x < 4; x++) {

			for(int y = 0; y < 4; y++) {

				if(x == y) {
					matriz[x][y] = diagonal;
					diagonal *= 3;
				} else {
					System.out.println("Informe o valor: ");
					matriz[x][y] = scanner.nextInt();
				}

			}

		}

		for(int x = 0; x < 4; x++) {

			System.out.printf("%d ", matriz[x][0]);
			System.out.printf("%d ", matriz[x][1]);
			System.out.printf("%d ", matriz[x][2]);
			System.out.printf("%d ", matriz[x][3]);
			System.out.println();

		}			

	}

}
