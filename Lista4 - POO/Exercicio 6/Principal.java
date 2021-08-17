package exercicio6;

public class Principal {

	public void meuMetodo(int num) throws ExceptionC{
		if(num == 0) {
			throw new ExceptionC();
		}
	}
	
	public static void main(String[] args) {
		
		Principal pr = new Principal();
		
		try {
			pr.meuMetodo(0);
		} catch (ExceptionC e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
