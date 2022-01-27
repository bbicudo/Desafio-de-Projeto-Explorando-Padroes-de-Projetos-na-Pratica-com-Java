import java.io.IOException;

public class Jogo {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		Monstro monstro1 = new Monstro("Goblin", 2, 4, 2, 1);
		Monstro monstro2 = new Monstro("Dragao", 20, 20, 20, 20);

		int iniciativaMonstro1 = monstro1.iniciativa();
		int iniciativaMonstro2 = monstro2.iniciativa();
		
		
		System.out.println("===== TESTE DE INICIATIVA =====");
		System.out.println(monstro1.getNome() + ": " + iniciativaMonstro1);
		System.out.println(monstro2.getNome() + ": " + iniciativaMonstro2);
		
		if(iniciativaMonstro1 > iniciativaMonstro2) {
			System.out.println();
			System.out.println("===== " + monstro1.getNome() + " inicia o combate =====");
			System.out.println("=======================================================");
			System.out.println(monstro1.getNome() + " ataca! " + monstro1.ataque());
			System.out.println(monstro2.getNome() + " tenta se defender! " + monstro1.ataque());
			
		}else {
			System.out.println("===== " + monstro2.getNome() + " inicia o combate =====");
			System.out.println(monstro2.getNome() + " ataca! " + monstro1.ataque());
			System.out.println(monstro1.getNome() + " tenta se defender! " + monstro1.ataque());
		}
		
		
		
		
	}

}
