package DragonBall;

public abstract class PersonagemDragonBall {
	protected String nome;
	protected String sexo;
	protected String poderEspecial;
	protected int idade;
	protected String temporada;
	protected double ki;
	
	public PersonagemDragonBall(String nome, int idade, String sexo, double ki, String poderEspecial, String temporada) {
		this.nome = nome;
		this.sexo = sexo;
		this.poderEspecial = poderEspecial;
		this.idade = idade;
		this.temporada = temporada;
		this.ki = ki;
		
	}
	
	public abstract double calcularPoder();
	
	public String toString() {
		return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nPoder especial: " + poderEspecial + "\nKi: " + ki + "\nTemporada: " + temporada;
	}
}
