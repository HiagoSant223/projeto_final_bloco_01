package games;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import games.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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
			System.out.println("            3 - Atualizar Jogo                       ");
			System.out.println("            4 - Deletar Jogo                         ");
			System.out.println("            5 - Sair                                 ");
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
			
			if(opcao == 5) {
	        	System.out.println(Cores.TEXT_WHITE_BOLD + "\nEpix Games - Aqui Sua Diversão Não Para!");
	        	sobre();
	        	leia.close();
	        	System.exit(0);
	        }
			
			switch (opcao) {
			case 1:
				System.out.println("Adicionar Novo Jogo\n\n");

				keyPress();
				break;
			case 2:
				System.out.println("Listar Todos os Jogos\n\n");

				keyPress();
				break;
			case 3:
				System.out.println("Atualizar Jogo\n\n");

				keyPress();
				break;
			case 4:
				System.out.println("Deletar Jogo\n\n");

				keyPress();
				break;
			case 5:
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
