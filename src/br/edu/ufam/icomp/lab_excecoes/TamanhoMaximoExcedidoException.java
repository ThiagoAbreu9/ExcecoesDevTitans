package br.edu.ufam.icomp.lab_excecoes;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException{
	public TamanhoMaximoExcedidoException() {
		super();
	}
	public TamanhoMaximoExcedidoException(String e) {
		super(e);
	}
	public String getMessage() {
		return String.format("Quantidade máxima de coordenadas excedida");
	}
}
