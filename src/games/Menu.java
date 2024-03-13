package games;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import games.controller.GamesController;
import games.model.GeneroAcao;
import games.model.GeneroAventura;
import games.util.Cores;

public class  Menu {

	public static void main(String[] args) {
		
		
		GamesController games = new GamesController();
		
		Scanner leia = new Scanner(System.in);
		
		 
		
		int opcao, id, genero, taxaAcao, taxaAventura;
		String titulo;
		float valor = 0.00f;
		
		System.out.println("Criar jogos");
		
		GeneroAcao j1 = new GeneroAcao(games.gerarId(), "GTA", 2, 350.0f, 10);
		games.criarJogo(j1);
		GeneroAcao j2 = new GeneroAcao(games.gerarId(), "Fortenite", 2, 100.0f, 2);
		games.criarJogo(j2);
		GeneroAventura j3 = new GeneroAventura(games.gerarId(), "Avatar", 1, 450.0f, 5);
		games.criarJogo(j3);
		GeneroAventura j4 = new GeneroAventura(games.gerarId(), "Horizon", 1, 250.0f, 8);
		games.criarJogo(j4);
		
		

		
		while(true) {

			System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                E P I C  G A M E S                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Novo Jogo                  ");
			System.out.println("            2 - Listar Todos os Jogos                ");
			System.out.println("            3 - Buscar Jogo Por ID                   ");
			System.out.println("            4 - Atualizar Jogo                       ");
			System.out.println("            5 - Deletar Jogo                         ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
		
		
        
			try {
			opcao = leia.nextInt();  
			}catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if(opcao == 6) {
	        	System.out.println(Cores.TEXT_WHITE_BOLD + "\nEpix Games - Aqui Sua Diversão Não Para!");
	        	sobre();
	        	leia.close();
	        	System.exit(0);
	        }
			
			switch (opcao) {
			case 1:
				System.out.println("Adicionar Novo Jogo\n\n");
				
				System.out.println("Digite o nome do Titulo: ");
				titulo = leia.next();
				
				System.out.println("Digite o Valor do Jogo (R$): ");
				valor = leia.nextFloat();

				
				do {
					System.out.println("Digite o Genero do Jogo (1 - Aventura ou 2 - Ação): ");
					genero = leia.nextInt();
				}while(genero < 1 && genero > 2);
				
				switch(genero) {
				 	case 1 -> {
				 		System.out.println("Digite a Taxa de Jogos de Aventura (%): ");
				 		taxaAventura = leia.nextInt();
				 		games.criarJogo(new GeneroAventura(games.gerarId(), titulo, genero, valor, taxaAventura));
				 	}
				 	case 2 -> {
				 		System.out.println("Digite a Taxa de Jogos de Ação (%): ");
				 		taxaAcao = leia.nextInt();
				 		games.criarJogo(new GeneroAcao(games.gerarId(), titulo, genero, valor, taxaAcao));
				 	}
				}
				
				keyPress();
				break;
			case 2:
				System.out.println("Listar Todos os Jogos\n\n");
				games.listarTodosJogos();

				keyPress();
				break;
			case 3:
				System.out.println("Buscar Jogo Por ID\n\n");
				
				System.out.println("Digite o ID do jogo: ");
				id = leia.nextInt();
				
				games.procurarPorId(id);
				
				keyPress();
				break;				
			case 4:
				System.out.println("Atualizar Jogo\n\n");
				
				System.out.println("Digite o Id do Jogo: ");
	        	id = leia.nextInt();
	        	
	        	var buscarJogo = games.buscarNaCollection(id);
	        	
	        	if(buscarJogo != null) {
	        		genero = buscarJogo.getGenero();
	        		
	        		System.out.println("Digite o Nome do Titulo: ");
	        		titulo = leia.next();
	        		System.out.println("Digite o valor do Jogo: ");
	        		leia.skip("\\R?");
	        		valor = leia.nextFloat();
	        		
	        		switch(genero) {
				 	case 1 -> {
				 		System.out.println("Digite a Taxa de Jogos de Aventura (%): ");
				 		taxaAventura = leia.nextInt();
				 		games.criarJogo(new GeneroAventura(games.gerarId(), titulo, genero, valor, taxaAventura));
				 	}
				 	case 2 -> {
				 		System.out.println("Digite a Taxa de Jogos de Ação (%): ");
				 		taxaAcao = leia.nextInt();
				 		games.criarJogo(new GeneroAcao(games.gerarId(), titulo, genero, valor, taxaAcao));
				 	}
	        			default -> {
	        				System.out.println("Tipo de Genero inválido!");
	        			}
	        		}
	        	}else {
	        		System.out.println("A conta não foi encontrada!");
	        	}

				keyPress();
				break;
			case 5:
				System.out.println("Deletar Jogo\n\n");
				
				System.out.println("Digite o Id do Jogo: ");
				id = leia.nextInt();
				
				
				games.deletarJogo(id);

				keyPress();
				break;
			case 6:
				System.out.println("Sair\n\n");

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				
				keyPress();
				break;
			}
		}

	}
	
	public static void sobre() {
		   System.out.println("\n********************************************");
		   System.out.println("Projeto desenvolvido por: Hiago Oliveira");
		   System.out.println("Hiago Oliveira - hiagosantos223@gmail.com");
		   System.out.println("https://github.com/HiagoSant223/projeto_final_bloco_01");
		   System.out.println("********************************************");
	   }
	
	public static void keyPress() {
		   try {
			   System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			   System.in.read();
		   }catch(IOException e) {
			   System.out.println("Você pressionou uma tecla diferente de enter!");
		   }
	   }
}
