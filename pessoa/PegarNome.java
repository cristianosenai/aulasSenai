package pessoa;

public class PegarNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa("Cristiano","Santos ", 38);
		System.out.println(pessoa1.getNomeCompleto());
		
		Pessoa pessoa2 = new Pessoa("João","Oliveira ", 39);
		System.out.println(pessoa2.getNomeCompleto());
	}

}
