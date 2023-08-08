package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaForaDosLimitesException extends RoverCoordenadaException{
	public CoordenadaForaDosLimitesException() {
		super();
	}
	public CoordenadaForaDosLimitesException(String e) {
		super(e);
	}
	public String getMessage() {
		return String.format("Coordenada com valores fora dos limites");
	}
}
