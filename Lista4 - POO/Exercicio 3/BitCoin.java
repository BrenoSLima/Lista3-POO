package exercicio3;

public class BitCoin implements ConversorMoedaInterface{
	public int atributoBitCoin;

	public float getConversaoDolar(float valorBitCoin) {
		return (float) 41463.60 * valorBitCoin;
	}
}
