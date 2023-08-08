package br.edu.ufam.icomp.lab_excecoes;

import java.util.ArrayList;

public class Caminho{
	private int tamanho;
	private Coordenada[] caminho;

	
	
	public int tamanho() {
		int tamanhoA = 0;
		for(int i=0;i<caminho.length;i++) {
			if(caminho[i] != null) {
				tamanhoA++;
			}
		}
		return tamanhoA;
	}
	public Caminho(int maxTam) {
		Coordenada[] caminho = new Coordenada[maxTam];
		this.caminho = caminho;
		this.tamanho = maxTam;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public void reset() {
		for(int i=0;i<caminho.length;i++) {
			caminho[i] = null;
		}
		this.caminho = caminho;
		
	}
	public String toString() {
		String msn = "Dados do caminho:\n"+"  - Quantidade de pontos: "
	+tamanho()+"\n"+"  - Pontos:\n";
		
		if (tamanho() != 0) {
			for (int i = 0; i < tamanho(); i++) {
				 msn += "    -> "+caminho[i].toString();
			}
		}
		return msn;
	}
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException 
	{
		if(tamanho() == tamanho) throw new TamanhoMaximoExcedidoException();
		if(tamanho()==0) {
			caminho[tamanho()] = coordenada;
		}else {
			if(caminho[tamanho()-1].distancia(coordenada)>15){
				throw new DistanciaEntrePontosExcedidaException();
			}else {
				caminho[tamanho()] = coordenada;
			}
		}
	}
	
	
	
}
