package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaNegativaException extends RoverCoordenadaException{
	public CoordenadaNegativaException() {
		super();
	}
	public CoordenadaNegativaException(String str) {
		super(str);
	}
	public String getMessage() {
		return String.format("Coordenada com valor negativo");
	}
}
