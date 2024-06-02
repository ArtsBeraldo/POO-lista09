package DragonBall;

public class Terraqueo extends PersonagemDragonBall {
	
	private String pais;
	private String cidade;
	
	public Terraqueo(String nome, int idade, String sexo, double ki, String poderEspecial, String temporada, String pais, String cidade) {
        super (nome, idade, sexo, ki, poderEspecial, temporada);
        this.pais = pais;
        this.cidade = cidade;
	}
        
	@Override
	public double calcularPoder() {
		return ki;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nPais: " + pais + "Cidade: " + cidade;
	}
}
