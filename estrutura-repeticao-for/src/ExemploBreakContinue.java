
public class ExemploBreakContinue {

	public static void main(String[] args) {
		
		System.out.println("Exemplo com BREAK");
		for (int numero = 1; numero <= 5; numero++) {
			if(numero == 3)// quando o número é igual á 3 ele para de contar
				break;
			
			System.out.println(numero);
		}
		
		System.out.println("-----------------------");
		
		System.out.println("Exemplo com CONTINUE");
		for (int numero = 1; numero <= 5; numero++) {
			if(numero == 3)// quando o número é igual a 3 pula o 3 e continua a contar
				continue;
			
			System.out.println(numero);
		}

	}

}
