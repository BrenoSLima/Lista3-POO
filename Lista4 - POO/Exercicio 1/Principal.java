package exercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Sapo s = new Sapo( );
		Ra r = new Ra( );
		Leao l = new Leao( );
		Macaco m = new Macaco( );
		Animal [ ] a = { s, r, l, m };

		for(int i = 0; i < 4; i++) {
			System.out.println(a[i].andar());
		}
		
	}

}
