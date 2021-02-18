public class Exe7 {

	public static void main(String[] args) {

		int valor = 100;

		System.out.println(calculaSoma(valor));
		
	}
	
	
	private static int calculaSoma(int valor) {

		if (valor == 1) {
			return valor;
		} else {
			return valor+calculaSoma(valor-1);
		}

	}

}
