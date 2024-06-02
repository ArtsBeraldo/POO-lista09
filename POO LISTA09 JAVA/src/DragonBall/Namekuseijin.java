package DragonBall;

public class Namekuseijin extends PersonagemDragonBall {
	
	private int quantidadeEsferas; 
	private boolean podeCurar;

	public Namekuseijin (String nome, int idade, String sexo, double ki, String poderEspecial, String temporada, int quantidadeEsferas, boolean podeCurar) {
		super (nome, idade, sexo, ki, poderEspecial, temporada);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
	}
        
	public String toString() {
		return super.toString() + "\nQuantidade de esfera: " + quantidadeEsferas + "Poder Curar: " + podeCurar;
	}
	
	public double calcularPoder() {
		return (double) (ki * (1 + (podeCurar ? 0.2 : 0)));
	}
	
	public String fazerDesejo(String desejo) {
        return "Desejo traduzido: " + desejo.replace("Poder", "Сила")
                                            .replace("Dominar o mundo", "Захватите мир")
                                            .replace("Felicidade", "счастье")
        									.replace("Riquezas", "Ресурсы")
									        .replace("Ser lindo igual o Arthur Beraldo", "Быть красивой, как Артур Беральдо")
									        .replace("Ser o mais forte do universo", "Станьте сильнейшим во вселенной")
									        .replace("Paz", "Мир");
    }

}
