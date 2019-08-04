package br.com.kasolution.teste;

import br.com.kasolution.dominio.Gol;
import br.com.kasolution.dominio.Jogador;
import br.com.kasolution.dominio.Jogo;
import br.com.kasolution.dominio.Time;
import br.com.kasolution.util.JogoUtil;



public class TesteJogo {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		jogador1.nome= "Vampeta";
		
		Jogador jogador2 = new Jogador();
		jogador2.nome= "Ronaldo";
		
		Jogador jogador3 = new Jogador();
		jogador3.nome= "Robinho";
		
		Jogador jogador4 = new Jogador();
		jogador4.nome= "Junior Baiano";
		
		Jogador jogador5 = new Jogador();
		jogador5.nome= "João";
		
		Jogador jogador6 = new Jogador();
		jogador6.nome= "Paulo";
		
		Jogador jogador7 = new Jogador();
		jogador7.nome= "Carlos";
		
		Jogador jogador8 = new Jogador();
		jogador8.nome= "André";
		
		Jogador jogador9 = new Jogador();
		jogador9.nome= "Pedro";
		
		Jogador jogador10 = new Jogador();
		jogador10.nome= "Cristiano";
	
		
		Time mandante = new Time();
		mandante.nome = "Corinthians";
	//	mandante.jogadores = new Jogador [] { jogador1, jogador2};
		mandante.jogadores = new Jogador [5] ;
		mandante.jogadores[0] = jogador1; 
     	mandante.jogadores[1] = jogador2;
     	mandante.jogadores[2] = jogador3; 
     	mandante.jogadores[3] = jogador4;
     	mandante.jogadores[4] = jogador5; 
     			
     	Time visitante = new Time();
		visitante.nome = "Flamengo";
	//	visitante.jogadores = new Jogador [] { jogador3, jogador4};
		visitante.jogadores = new Jogador [5] ;
		visitante.jogadores[0] = jogador6; 
		visitante.jogadores[1] = jogador7;
		visitante.jogadores[2] = jogador8; 
		visitante.jogadores[3] = jogador9;
		visitante.jogadores[4] = jogador10;
		
		System.out.println("Time mandante:" + mandante.nome);
		System.out.println("Relação de jogadores: ");
		//System.out.println("Time mandante:" + mandante.jogadores[0].nome);
		//for-each (loop) repete uma instrução conforme a quantidade de elementos da lista
		for ( Jogador j: mandante.jogadores) {
			//instrução
			System.out.println("\tjogador: " +j.nome);
		};
			
		System.out.println("\nTime visitante:" + visitante.nome);
		System.out.println("Relação de jogadores: ");
			
		for ( Jogador j: visitante.jogadores) {
				//instrução
		System.out.println("\tjogador: " +j.nome);

		}
		
		
		for (int i =1; i <= 6; i++) {
			System.out.println("\n****NOVO JOGO***");
			Jogo jogo = new Jogo();
			mandante.setPontos(0);
			visitante.setPontos(0);
		
			jogo.mandante = mandante;
			jogo.visitante = visitante;
			int numeroDeGols = (int) (Math.random()*7);
			jogo.gols = new Gol [numeroDeGols];
			
			for (int ii = 0; ii < numeroDeGols; ii++ ) {
				jogo.gols[ii] = JogoUtil.getGol(jogo);
			}
			
			for (Gol g: jogo.gols) {
				g.imprime();
				}
			
			if (jogo.mandante.getPontos() > jogo.visitante.getPontos()){
				System.out.println("Time vencedor: " + mandante.nome);
			}else if (jogo.mandante.getPontos() < jogo.visitante.getPontos()){
				System.out.println("Time vencedor: " + visitante.nome);
			}else {
				System.out.println("Jogo empatado");
			}
		}
		
	}
}

