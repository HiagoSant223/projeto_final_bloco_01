package games.model;

public class GeneroAcao extends Games{
	
	private float obterTamanhoArquivo;

	public GeneroAcao(int id, String titulo, String genero, float valor, float obterTamanhoArquivo) {
		super(id, titulo, genero, valor);
		this.obterTamanhoArquivo = obterTamanhoArquivo;
		
	}
	
	public float getObterTamanhoArquivo() {
		return obterTamanhoArquivo;
	}

	public void setObterTamanhoArquivo(float obterTamanhoArquivo) {
		this.obterTamanhoArquivo = obterTamanhoArquivo;
	}

	public float obterTamanhoArquivo() {
        // Implementação para obter o tamanho do arquivo do jogo de ação em MB
        return 200.8f; // Exemplo: 200.8 MB
    }

}
