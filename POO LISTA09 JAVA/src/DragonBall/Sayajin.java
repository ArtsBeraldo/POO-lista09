package DragonBall;

public class Sayajin extends PersonagemDragonBall implements Transformavel {
	
	private int nivelMaximoSSJ;
	private boolean temRabo;
	
	public Sayajin(String nome, int idade, String sexo, double ki, String poderEspecial, String temporada, int nivelMaximoSSJ, boolean temRabo) {
		super (nome, idade, sexo, ki, poderEspecial, temporada);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;
	}
	
	@Override
	public double calcularPoder() {
		return (double) (ki * (1 + nivelMaximoSSJ * 0.1));
	}
	@Override
	public String toString() {
		return super.toString() + "\nNível Maxímo: " + nivelMaximoSSJ + "Tem rabo: " + temRabo;
	}
	
	@Override
    public String transformar(int nivel) {
        if (nivel >= 1 && nivel <= 3) {
            return nome + " transformou para super sayajin nível " + nivel;
        } else if ((nome.equals("Goku") || nome.equals("Vegeta")) && (nivel == 4 || nivel == 5)) {
            return nome + " transformou para super sayajin nível " + nivel;
        } else {
            return "(" + nome + ") Não foi possível transformar esse sayajin";
        }
    }

}
