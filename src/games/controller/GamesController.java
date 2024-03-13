package games.controller;

import java.util.ArrayList;
import java.util.List;

import games.model.Games;
import games.repository.GamesRepository;

public class GamesController implements GamesRepository{
	
	private ArrayList<Games> listaJogos = new ArrayList<Games>();
	int id = 0;

	@Override
	public void criarJogo(Games jogo) {
		listaJogos.add(jogo);
		System.out.println("\nO Jogo Id: " + jogo.getId() + " foi criado com sucesso!");
		
	}

	@Override
	public List<Games> listarTodosJogos() {
		for(var games : listaJogos) {
			games.visualizar();
		}
		return listaJogos;
	}

	@Override
	public Games buscarNaCollection(int id) {
		for (var jogo : listaJogos) {
			if(jogo.getId() == id) {
				return jogo;
			}
		}
		return null;
	}

	@Override
	public void atualizarJogo(Games jogo) {
		var buscarJogo = buscarNaCollection(jogo.getId());
		
		if(buscarJogo != null) {
			listaJogos.set(listaJogos.indexOf(buscarJogo), jogo);
			System.out.println("\nO Jogo Id: " + jogo.getId() + " foi atualizado com sucesso!");
		}else
			System.out.println("\nO Jogo Id: " + jogo.getId() + " não foi encontrado!");
		
	}

	@Override
	public void deletarJogo(int id) {
		var jogo = buscarNaCollection(id);
		
		if(jogo != null) {
			if (listaJogos.remove(jogo) == true)
				System.out.println("\nO Jogo Id: " + id + " foi deletado com sucesso!");
		}else
			System.out.println("\nO Jogo Id: " + id + " não foi encontrado!");
		
	}
	
	public int gerarId() {
		return ++ id;
	}

	@Override
	public void procurarPorId(int id) {
		var jogo = buscarNaCollection(id);
		
		if (jogo != null)
			jogo.visualizar();
		else
			System.out.println("\nO Jogo Id: " + id + " não foi encontrado!");
		
	}

}
