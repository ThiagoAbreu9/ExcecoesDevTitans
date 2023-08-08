package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
	public static void main(String[] args) {
		Caminho vai = new Caminho(4);
	
	try {
		
		Coordenada cor1 = new Coordenada(21, 45, 1);
		Coordenada cor2 = new Coordenada(22, 21, 2);
		Coordenada cor3 = new Coordenada(40, 25, 3);
		Coordenada cor4 = new Coordenada(21, 23, 4);
		
		vai.addCoordenada(cor1);
		vai.addCoordenada(cor2);
		vai.addCoordenada(cor3);
		vai.addCoordenada(cor4);
		
		vai.toString();
	} catch (Exception e) {
		vai.reset();
	}
	}
}
