package exercicio5;

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
			System.out.println(item.operarFloat((float) 10.3,(float) 9));
			System.out.println(item.operarInt((int) 10,(int) 9));
			System.out.println(item.operarDouble((double) 10.3, (double) 9));
			System.out.println(item.operarLong((long) 10.3,(long) 9));
			System.out.println(item.operarShort((short) 10.3,(short) 9));
		
		
	}
}
