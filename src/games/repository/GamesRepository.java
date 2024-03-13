package games.repository;

import java.util.List;

import games.model.Games;

public interface GamesRepository {
	
	public void criarJogo(Games jogo);
	List<Games> listarTodosJogos();
	Games buscarNaCollection(int id);
	public void procurarPorId(int id);
	public void atualizarJogo(Games jogo);
	public void deletarJogo(int id);
}
