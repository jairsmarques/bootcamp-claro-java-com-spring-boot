
public class IncrementoDecremento {

	public static void main(String[] args) {
		
		int numero = 5;
		
		numero++;
		System.out.println(numero);
		
		numero--;
		System.out.println(numero);
		
		++numero;
		System.out.println(numero);
		
		--numero;
		System.out.println(numero);
		
		int outroNumero = 5;
		
		System.out.println(outroNumero ++);// imprime e depois incrementa
		
		outroNumero = 5;
		System.out.println(++ outroNumero);// incrementa e depois imprime
	}

}
