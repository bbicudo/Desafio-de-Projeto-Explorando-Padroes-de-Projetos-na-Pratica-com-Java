import java.io.IOException;


public class Jogo {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		ListaMonstros lista = new ListaMonstros();
		RolarDados escolherInimigo = RolarDados.getInstancia();
		
		Monstro inimigo = lista.getCompendium().get(escolherInimigo.rolarDado(1, 10));
		Monstro monstro1 = new Monstro(inimigo.getNome(), inimigo.getModDano(), inimigo.getModAtaque(), inimigo.getClasseArmadura(), inimigo.getIniciativa(), inimigo.getHp(), inimigo.getQtdDadosDano(), inimigo.getDadoDano());
		
		inimigo = lista.getCompendium().get(escolherInimigo.rolarDado(1, 10));
		Monstro monstro2 = new Monstro(inimigo.getNome(), inimigo.getModDano(), inimigo.getModAtaque(), inimigo.getClasseArmadura(), inimigo.getIniciativa(), inimigo.getHp(), inimigo.getQtdDadosDano(), inimigo.getDadoDano());
		
		int iniciativaMonstro1 = monstro1.iniciativa();
		int iniciativaMonstro2 = monstro2.iniciativa();
		
		Monstro primeiro;
		Monstro segundo;
		
		int hpPrimeiro;
		int hpSegundo;
		
		String vidaPrimeiro = "";
		String vidaSegundo = "";
		String vencedor = "";
		int round=1;
		
		System.out.println("===== TESTE DE INICIATIVA =====");
		System.out.println(monstro1.getNome() + ": " + iniciativaMonstro1);
		System.out.println(monstro2.getNome() + ": " + iniciativaMonstro2);
		System.out.println();
		System.out.println();
		
		if(iniciativaMonstro1 > iniciativaMonstro2) {
			
			primeiro = monstro1;
			segundo = monstro2;
			
			hpPrimeiro = primeiro.getHp();
			hpSegundo = segundo.getHp();
			
			System.out.println(primeiro.getNome() + " começa!");
			
			System.out.println();
			System.out.println();
			
		}else {
			primeiro = monstro2;
			segundo = monstro1;
			
			hpPrimeiro = primeiro.getHp();
			hpSegundo = segundo.getHp();
			
			System.out.println(segundo.getNome() + " começa!");
			
			System.out.println();
			System.out.println();
			new ProcessBuilder("cmd", "/c", "cls");
		}
		
		while(hpPrimeiro > 0 && hpSegundo > 0) {
			vidaPrimeiro =  "";
			vidaSegundo =  "";
			
			
			for(int i= 0; i < hpPrimeiro; i++) {
				vidaPrimeiro +=  "\u2665 ";
			}
			
			for(int i= 0; i < hpSegundo; i++) {
				vidaSegundo +=  "\u2665 ";
			}
			
			System.out.println("=============== ROUND " + round + "=======================");
			System.out.println(String.format(primeiro.getNome() + ": " + vidaPrimeiro + "\t\t" + segundo.getNome() + ": " + vidaSegundo));
			
			System.out.println(primeiro.getNome() + " tenta realizar um ataque");
			
			if(primeiro.acao.atacar() + primeiro.getModAtaque() > segundo.acao.defender() + segundo.getClasseArmadura()) {
				int dano = primeiro.acao.causarDano(primeiro.getQtdDadosDano(), primeiro.getDadoDano() + primeiro.getModDano());
				System.out.println(primeiro.getNome() + " acerta em cheio e causa " + dano + " em " + segundo.getNome());
				hpSegundo -= dano;
			}else {
				System.out.println(segundo.getNome() + " consegue se defender do ataque de " + primeiro.getNome() + "!");
			}
			
			if(hpSegundo >0) {

			System.out.println(segundo.getNome() + " tenta atacar de volta!");
			
				if(segundo.acao.atacar() + segundo.getModAtaque() > primeiro.acao.defender() + primeiro.getClasseArmadura()) {
					int dano = segundo.acao.causarDano(segundo.getQtdDadosDano(), segundo.getDadoDano() + segundo.getModDano());
					System.out.println(segundo.getNome() + " acerta em cheio e causa " + dano + " em " + primeiro.getNome());
					hpPrimeiro -= dano;
				}else {
					System.out.println(primeiro.getNome() + " consegue se defender do ataque de " + segundo.getNome() + "!");
				}
			
			}
			
			System.out.println();
			System.out.println();
			
			if(hpPrimeiro <= 0) {
				vencedor = segundo.getNome();
			}else {
				vencedor = primeiro.getNome();
			}
			
			round++;		
		}
		
		vidaPrimeiro =  "";
		vidaSegundo =  "";
		for(int i= 0; i < hpPrimeiro; i++) {
			vidaPrimeiro +=  "\u2665 ";
		}
		
		for(int i= 0; i < hpSegundo; i++) {
			vidaSegundo +=  "\u2665 ";
		}
		
		System.out.println(String.format(primeiro.getNome() + ": " + vidaPrimeiro + "\t\t" + segundo.getNome() + ": " + vidaSegundo));
		System.out.println("############ VENCEDOR ###############");
		System.out.println(vencedor);
		
	}

}