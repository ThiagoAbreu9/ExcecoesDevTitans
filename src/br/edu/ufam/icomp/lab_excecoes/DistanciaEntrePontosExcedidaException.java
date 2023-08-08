package br.edu.ufam.icomp.lab_excecoes;

public class DistanciaEntrePontosExcedidaException extends RoverCaminhoException {
	public DistanciaEntrePontosExcedidaException() {
		super();
	}
	public DistanciaEntrePontosExcedidaException(String e) {
		super(e);
	}
	public String getMessage() {
		return String.format("Distância máxima entre duas coordenadas vizinhas excedida");
	}
}
