package exercicio4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Operacao> lista = new ArrayList<>(); 

		Soma soma = new Soma();
		Subtracao subtracao = new Subtracao();
		Divisao divisao = new Divisao();
		Multiplicacao multiplicacao = new Multiplicacao();
		
		lista.add(soma);
		lista.add(subtracao);
		lista.add(divisao);
		lista.add(multiplicacao);
		
		for (Operacao item : lista)
			System.out.println(item.operar((float) 10.3,(float) 9));
		
	}
}
