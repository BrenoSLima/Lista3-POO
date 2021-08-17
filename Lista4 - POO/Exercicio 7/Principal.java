import java.io.IOException;

public class Principal {

	public static void main(String[] args) {

		int valor;
		
		
		try {
		
			valor = 8/0;
			
		}catch(ExceptionA exA) {
			exA.printStackTrace();
			System.out.println(exA.getMessage());
			
		}catch(ExceptionB exB) {
			exB.printStackTrace();
			System.out.println(exB.getMessage());
			
		}catch(NullPointerException exNull) {
			exNull.printStackTrace();
			System.out.println(exNull.getMessage());
			
		}catch(IOException exIO) {
			exIO.printStackTrace();
			System.out.println(exIO.getMessage());
			
		}catch(Exception exception) {
			exception.printStackTrace();
			System.out.println(exception.getMessage());
			
		}

	}

}
