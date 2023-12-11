package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel { //EXTENDS = HERANÇA, obs: você só pode herdar de uma unica classe
	
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	@Override
	
	public int getClassificacao() {
		return (int) pegaMedia() / 2;
	}
	
	
	
}
