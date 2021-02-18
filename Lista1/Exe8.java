public class Exe8 {

	public static void main(String[] args) {

		int valor = 200;

		System.out.println(calculaSoma(valor));
		
	}
	
	private static int calculaSoma(int valor) {

        if (valor == 1) {
            return 0;
        } else if (valor % 2 == 0 ) {
            return valor+calculaSoma(valor-1);
        } else {
            return calculaSoma(valor-1);
        }

	}

}
