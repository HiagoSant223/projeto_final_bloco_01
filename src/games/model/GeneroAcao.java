package games.model;

public class GeneroAcao extends Games{
	
	private int taxaAcao = 5;

	public GeneroAcao(int id, String titulo, int genero, float valor, int taxaAcao) {
		super(id, titulo, genero, valor);
		this.taxaAcao = taxaAcao;
		
	}
	
	public float gettaxaAcao() {
		return taxaAcao;
	}

	public void setObterTamanhoArquivo(int taxaAcao) {
		this.taxaAcao = taxaAcao;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Taxa do Jogo: " + this.taxaAcao);
}
}
