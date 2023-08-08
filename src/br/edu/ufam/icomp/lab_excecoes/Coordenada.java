package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
	
	private int posX, posY, digito;
	
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
		
				
			if(posX < 0 || posY < 0) throw new CoordenadaNegativaException();
			
			if((posX < 0 || posX > 30000) || (posY < 0 || posY > 30000)) throw new CoordenadaForaDosLimitesException();				
			
			
			if((posX + posY) % 10 != digito) throw new DigitoInvalidoException();
				
		this.posX = posX;
		this.posY = posY;
		this.digito = digito;
	}
	
	public Coordenada(int posX, int posY) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException {
		if(posX < 0 || posY < 0) throw new CoordenadaNegativaException();
		
		if((posX < 0 || posX > 30000) || (posY < 0 || posY > 30000)) throw new CoordenadaForaDosLimitesException();				
			
	this.posX = posX;
	this.posY = posY;
		
	};
	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public double distancia(Coordenada coordenada) {
		
		int Dx2x1, Dy2y1;
		double distancia;
		
		Dx2x1 = posX - coordenada.posX;
		Dy2y1 = posY - coordenada.posY;
		
		distancia = Math.sqrt(Math.pow(Dx2x1, 2) + Math.pow(Dy2y1, 2));
		
		return distancia;
	}
	
	
	public String toString() {
		
		return String.format(posX+", "+posY);
				
				
	}
	
}