package exercicio3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<ConversorMoedaInterface> lista = new ArrayList<>(); 

		BitCoin bitcoin = new BitCoin();
		Euro euro = new Euro();
		Real real = new Real();
		
		
		lista.add(bitcoin);
		lista.add(euro);
		lista.add(real);
		
		for (ConversorMoedaInterface item : lista)
			System.out.println(item.getConversaoDolar(1));
		
	}

}
