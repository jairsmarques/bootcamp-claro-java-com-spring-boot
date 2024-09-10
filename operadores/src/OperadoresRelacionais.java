
public class OperadoresRelacionais {

	public static void main(String[] args) {
		int numero1 = 1;
		int numero2 = 2;
		
		if (numero1 < numero2) {
			System.out.println("a nossa condição é verdadeira");
		}
		
		System.out.println("--------------");
		
		boolean simNao = numero1 == numero2;// operador de igualdade
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		simNao = numero1 != numero2;// operador de diferença
		System.out.println("numeroUm é diferente que numeroDois? " + simNao);
		
		simNao = numero1 > numero2;// operador de maior
		System.out.println("numeroUm é maior que numeroDois? " + simNao);
		
		simNao = numero1 < numero2;// operador de maior
		System.out.println("numeroUm é menor que numeroDois? " + simNao);
		
		System.out.println("-------------------------");
		String nomeUm = "Jair";
		String nomeDois = "Jair";
		
		System.out.println(nomeUm == nomeDois);
		
		nomeDois = new String("Jair");// 
		System.out.println(nomeUm == nomeDois);
		System.out.println(nomeUm.equals(nomeDois));//usa-se equal para comparação  de objetos

	}

}
