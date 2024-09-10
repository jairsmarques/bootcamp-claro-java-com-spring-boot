
public class ExemploDeConstante {

	public static void main(String[] args) {
		int numero = 5;
		System.out.println(numero);
		numero = 10;
		System.out.println(numero);
		System.out.println("-------------------------");

		final double VALOR_DE_PI = 3.14; // contante -> convenção -> caixa alta
		// adicionar a palavra final para determinar que a variáavel é uma constante
		System.out.println(VALOR_DE_PI);

	}

}
