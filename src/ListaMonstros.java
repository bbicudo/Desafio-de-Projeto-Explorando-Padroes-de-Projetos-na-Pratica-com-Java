import java.util.HashMap;

public class ListaMonstros {

	@SuppressWarnings("serial")
	HashMap<Integer, Monstro> compendium = new HashMap<>() {{
		
			put(1, new Monstro("Goblin Desarmado", 1, 1, 2, 5, 2, 4, 1));
			put(2, new Monstro("Goblin de Porrete", 3, 2, 2, 5, 2, 1, 6));
			put(3, new Monstro("Goblin Guerreiro", 5, 3, 4, 3, 5, 2, 6));
			put(4, new Monstro("Troglodita", 3, 4, 4, 3, 5, 2, 4));
			put(5, new Monstro("Bandido", 5, 6, 6, 7, 10, 2, 4));
			put(6, new Monstro("Mago", 10, 5, 2, 2, 8, 2, 6));
			put(7, new Monstro("Guerreiro", 10, 8, 8, 1, 15, 2, 8));
			put(8, new Monstro("Cachorro Pulguento", 4, 4, 1, 10, 12, 4, 4));
			put(9, new Monstro("Abelha", 10, 10, 1, 1, 1, 1, 10));
			put(10, new Monstro("Dragão", 20, 20, 20, 20, 40, 6, 10));
		
		}};

	public HashMap<Integer, Monstro> getCompendium() {
		return compendium;
	}
		
		
	
	
}
