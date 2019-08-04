package br.com.kasolution.dominio;


public class Gol {
	public Time time;
	public Jogador jogador;
	public double hora;
	
	public void imprime( ) {
		System.out.println("\nGol aos " + hora + " minutos");
		System.out.println("Time: " + time.nome);
		System.out.println("Jogador: " + jogador.nome);
	}
	
}

