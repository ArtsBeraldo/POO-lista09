package DragonBall;

public class Principal {

	public static void main(String[] args) {
        Sayajin goku = PersonagemFactory.criarGoku();
        Sayajin gohan = PersonagemFactory.criarGohan();
        Namekuseijin dende = PersonagemFactory.criarDende();

        System.out.println(goku.transformar(5));
        
        System.out.println(gohan.transformar(5));

        System.out.println(dende.fazerDesejo("Ser lindo igual o Arthur Beraldo"));
	}

}
