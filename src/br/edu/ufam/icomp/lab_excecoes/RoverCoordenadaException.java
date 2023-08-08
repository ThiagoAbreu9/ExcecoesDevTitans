package br.edu.ufam.icomp.lab_excecoes;

public class RoverCoordenadaException extends RoverException {
	public RoverCoordenadaException() {
		super();
	}
	public RoverCoordenadaException(String str) {
		super(str);
	}
	public String getMessage() {
		return String.format("Exceção geral de coordenada do rover");
	}
}
