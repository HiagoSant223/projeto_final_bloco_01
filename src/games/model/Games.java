package games.model;

public abstract class Games {

	private int id;
	private String titulo;
	private String genero;
	private float valor;
	
	
	public Games(int id, String titulo, String genero, float valor){
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


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Valor: " + valor);
    }
	
}
