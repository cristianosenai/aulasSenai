package pessoa;

public class Pessoa {
	private String primeiroNome;
	private String ultimoNome;
	private int idade;
	
	public Pessoa(String primeiro, String ultimo, int id) {
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		idade = id;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + ultimoNome + " A idade dele é " + idade;
		return nomeCompleto;
	}
}
