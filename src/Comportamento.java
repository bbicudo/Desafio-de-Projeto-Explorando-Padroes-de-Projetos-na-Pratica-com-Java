public interface Comportamento {
	
	//Interface Strategy
	public int atacar();
	public int defender();
	public int testarPericia();
	public int causarDano(int qtd, int dado);

}
