import java.io.IOException;

public class Acao implements Comportamento{
	
	//Singleton e Implementa��o de Strategy para atacar (ou se defender) de diferentes formas

	public static final String URL_GET = "http://roll.diceapi.com/json/d20"; 

	RolarDados rolar = RolarDados.getInstancia();

	@Override
	public int atacar() {
		
		int ataque = 0;
		
		try {
			ataque = rolar.rolarDado(1, 20);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ataque;
		
	}

	@Override
	public int defender() {
		
		int defesa = 0;
		
		try {
			defesa = rolar.rolarDado(1, 20);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return defesa;

	}

	@Override
	public int testarPericia() {
		int pericia = 0;
		
		try {
			pericia = rolar.rolarDado(1, 20);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pericia;
	}

	@Override
	public int causarDano(int qtd, int dado) {
		int dano = 0;
		
		try {
			dano = rolar.rolarDado(qtd, dado);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dano;
	}

}
