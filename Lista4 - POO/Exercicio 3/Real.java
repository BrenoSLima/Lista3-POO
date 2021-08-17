package exercicio3;

public class Real implements ConversorMoedaInterface{
	public int atributoReal;
	
	public float getConversaoDolar(float valorReal) {
		return (float) 0.19 * valorReal;
	}

}
