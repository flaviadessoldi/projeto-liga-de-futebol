package br.com.kasolution.dominio;

public class Time {
	
	public String nome;
	public Jogador [] jogadores;
	private int pontos;
	
	public int getPontos () {
		return pontos;
	}
	public void setPontos (int pontos) {
		this.pontos = pontos;
	}
}

