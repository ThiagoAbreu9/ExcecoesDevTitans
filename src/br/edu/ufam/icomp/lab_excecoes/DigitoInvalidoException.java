package br.edu.ufam.icomp.lab_excecoes;

public class DigitoInvalidoException extends RoverCoordenadaException{
	public DigitoInvalidoException() {
		super();
	}
	public DigitoInvalidoException(String e) {
		super(e);
	}
	public String getMessage() {
		return String.format("Digito da coordenada inválido");
	}
}
