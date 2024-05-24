package escola;

public class Escola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno cristiano = new Aluno();
		
		cristiano.setNome("Cristiano Santos");
		cristiano.setIdade(38);
		
		System.out.println("O aluno "+ cristiano.getNome() + " tem "+ cristiano.getIdade()+" anos!");
	}

}
