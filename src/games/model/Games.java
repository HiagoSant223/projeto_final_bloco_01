package games.model;

public abstract class Games {

	private int id;
	private String titulo;
	private int genero;
	private float valor;
	
	
	public Games(int id, String titulo, int genero, float valor){
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.valor = valor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getGenero() {
		return genero;
	}


	public void setGenero(int genero) {
		this.genero = genero;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		
		String genero = "";
		
		switch(this.genero) {
		case 1:
			genero = "Jogo de Aventura";
			break;
		case 2:
			genero = "Jogo de Acao";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Jogo:");
		System.out.println("***********************************************************");
		System.out.println("Id do Jogo: " + this.id);
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Genero do Jogo: " + genero);
		System.out.println("Valor: " + this.valor);
	}
	
}
