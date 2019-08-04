package br.com.kasolution.util;

import br.com.kasolution.dominio.Gol;
import br.com.kasolution.dominio.Jogador;
import br.com.kasolution.dominio.Jogo;
import br.com.kasolution.dominio.Time;

public class JogoUtil {

	public static Gol getGol(Time time, Jogador jogador,
			                                     double hora) {
		Gol gol = new Gol();
		gol.time = time;
		gol.jogador = jogador;
		gol.hora = hora;
		gol.time.setPontos(gol.time.getPontos() + 2);
		return gol;
	}
	
	public static Gol getGol(Jogo jogo) {
		int i = (int) (Math.random() * 100);
		Time time;
		if (i % 2 == 0) {
			time = jogo.mandante;
		} else {
			time = jogo.visitante;
		}//fim if
		
		int j = (int) (Math.random() * (time.jogadores.length - 1));
		Jogador jogador = time.jogadores[j];
		
		double hora = (int) (Math.random() * 90);
		
		return getGol(time, jogador, hora);
		
		
	}//fim gol
	
}//fim classe










