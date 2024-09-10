
public class OperadorTernario {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 5;
		b = 6; 
		String resultado = "";
		
		/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		 if(a == b)
		 	resultado = "verdadeiro";
		 else 
		 	resultado = "falso"
		 */
		
		// operador ternario
		resultado = a ==b ? "verdadeiro" : "falso";
		
		System.out.println(resultado);

	}

}
