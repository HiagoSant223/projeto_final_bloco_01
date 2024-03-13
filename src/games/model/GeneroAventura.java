package games.model;

public class GeneroAventura extends Games {
	
	private int taxaAventura = 10;

	public GeneroAventura(int id, String titulo, int genero, float valor, int taxaAventura) {
		super(id, titulo, genero, valor);
		this.taxaAventura = taxaAventura;
		
	}
	
	public int gettaxaAventura() {
		return taxaAventura;
	}

	public void settaxaAventura(int taxaAventura) {
		this.taxaAventura = taxaAventura;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Taxa do Jogo: " + this.taxaAventura);
}

}
