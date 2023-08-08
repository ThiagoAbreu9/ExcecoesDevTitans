package br.edu.ufam.icomp.lab_excecoes;

public class RoverCaminhoException extends RoverException {
	public RoverCaminhoException() {
		super();
	}
	
	public RoverCaminhoException(String str) {
		super(str);
	}
	
	public String getMessage() {
		return String.format("Exceção geral de caminho do rover");
	}

}