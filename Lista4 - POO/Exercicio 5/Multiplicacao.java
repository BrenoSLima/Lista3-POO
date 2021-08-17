package exercicio5;

public class Multiplicacao implements Operacao{

	public float operarFloat(float var1, float var2) {
		return var1 * var2;
	}
	
	public int operarInt(int var1, int var2) {
		return var1 * var2;
	}
	
	public double operarDouble(double var1, double var2) {
		return var1 * var2;
	}
	
	public long operarLong(long var1, long var2) {
		return var1 * var2;
	}
	
	public short operarShort(short var1, short var2) {
		return (short) (var1 * var2);
	}
}
