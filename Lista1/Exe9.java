public class Exe9 {

	public static void main(String[] args) {

		int valor = 300;

		System.out.println(calculaSoma(valor));
		
	}
	
	private static int calculaSoma(int valor) {

        if (valor == 1) {
            return valor;
        } else if (valor % 2 == 1 ) {
            return valor+calculaSoma(valor-1);
        } else {
            return calculaSoma(valor-1);
        }

	}

}
