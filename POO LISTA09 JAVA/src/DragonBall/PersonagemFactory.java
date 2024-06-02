package DragonBall;

public class PersonagemFactory {
	
	 public static Terraqueo criarKuririn() {
	        return new Terraqueo("Kuririn",  35, "Masculino", 3000, "Kienzan", "Dragon Ball Z", "Terra", "Cidade do Oeste");
	    }

	    public static Sayajin criarGoku() {
	        return new Sayajin("Goku", 40, "Masculino", 50000, "Kamehameha", "Dragon Ball Super", 5, true);
	    }

	    public static Sayajin criarGohan() {
	        return new Sayajin("Gohan", 20, "Masculino", 45000, "Masenko", "Dragon Ball Z", 3, true);
	    }

	    public static Namekuseijin criarDende() {
	        return new Namekuseijin("Dendê", 200, "Masculino", 15000, "Cura", "Dragon Ball Z", 7, true);
	    }

}
