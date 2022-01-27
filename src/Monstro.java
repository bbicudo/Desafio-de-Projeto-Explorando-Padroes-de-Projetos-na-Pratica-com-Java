
public class Monstro {
	
	//Classe de monstros

	private String nome;
	private int modDano;
	private int modAtaque;
	private int classeArmadura;
	private int iniciativa;
	
	public Monstro() {
	}

	public Monstro(String nome, int modDano, int modAtaque, int classeArmadura, int iniciativa) {
		this.nome = nome;
		this.modDano = modDano;
		this.modAtaque = modAtaque;
		this.classeArmadura = classeArmadura;
		this.iniciativa = iniciativa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getModDano() {
		return modDano;
	}

	public void setModDano(int modDano) {
		this.modDano = modDano;
	}

	public int getModAtaque() {
		return modAtaque;
	}

	public void setModAtaque(int modAtaque) {
		this.modAtaque = modAtaque;
	}
	
	public int getClasseArmadura() {
		return classeArmadura;
	}

	public void setClasseArmadura(int classeArmadura) {
		this.classeArmadura = classeArmadura;
	}
	
	public int getIniciativa() {
		return iniciativa;
	}

	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}
	
	Acao acao = new Acao();
	
	public int ataque() {
		int ataqueTotal = acao.atacar() + this.getModAtaque();
		
		return ataqueTotal;
	}
	
	public int defesa() {
		int defesaTotal = acao.defender() + this.getClasseArmadura();
		
		return defesaTotal;
	}
	
	public int iniciativa() {
		int iniciativaTotal = acao.testarPericia() + this.getIniciativa();
		
		return iniciativaTotal;	
	}
}
