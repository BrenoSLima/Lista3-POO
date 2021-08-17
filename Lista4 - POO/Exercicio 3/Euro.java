package exercicio3;

public class Euro implements ConversorMoedaInterface{
	public int atributoEuro;
	
	public float getConversaoDolar(float valorDolar) {
		return (float) 1.19 * valorDolar;
	}

}
