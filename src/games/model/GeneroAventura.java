package games.model;

public class GeneroAventura extends Games {
	
	private int calcularTempoDeJogo;

	public GeneroAventura(int id, String titulo, String genero, float valor, int calcularTempoDeJogo) {
		super(id, titulo, genero, valor);
		this.calcularTempoDeJogo = calcularTempoDeJogo;
		
	}
	
	public int getCalcularTempoDeJogo() {
		return calcularTempoDeJogo;
	}

	public void setCalcularTempoDeJogo(int calcularTempoDeJogo) {
		this.calcularTempoDeJogo = calcularTempoDeJogo;
	}

	public int calcularTempoDeJogo() {
		return 10;
    }

}
