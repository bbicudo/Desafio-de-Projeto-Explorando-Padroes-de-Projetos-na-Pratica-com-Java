import java.util.Objects;

public class Monstro {
	
	//Classe de monstros

	private String nome;
	private int modDano;
	private int modAtaque;
	private int classeArmadura;
	private int iniciativa;
	private int hp;
	private int qtdDadosDano;
	private int dadoDano;
	
	public Monstro() {
	}

	public Monstro(String nome, int modDano, int modAtaque, int classeArmadura, int iniciativa, int hp, int qtdDadoDano, int dadoDano) {
		this.nome = nome;
		this.modDano = modDano;
		this.modAtaque = modAtaque;
		this.classeArmadura = classeArmadura;
		this.iniciativa = iniciativa;
		this.hp = hp;
		this.qtdDadosDano = qtdDadoDano;
		this.dadoDano = dadoDano;
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
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.iniciativa = hp;
	}
	
	public int getQtdDadosDano() {
		return qtdDadosDano;
	}

	public void setQtdDadosDano(int qtdDadosDano) {
		this.qtdDadosDano = qtdDadosDano;
	}
		
	public int getDadoDano() {
		return dadoDano;
	}

	public void setDadoDano(int dadoDano) {
		this.dadoDano = dadoDano;
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
	
	@Override
	public String toString() {
		return "{" +
					"nome:'" + nome + '\'' +
					"modDano:'" + modDano + '\'' +
					"modAtaque:'" + modAtaque + '\'' +
					"classeArmadura:'" + classeArmadura + '\'' +
					"inciativa:'" + iniciativa + '\'' +
					"hp:'" + hp + '\'' +
					"qtdDadoDano:'" + qtdDadosDano + '\'' +
					"dadoDano:'" + dadoDano + '\'' +
				"}";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, modDano, modAtaque, classeArmadura, iniciativa, hp);
	}
}
