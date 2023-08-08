package br.edu.ufam.icomp.lab_excecoes;

import java.io.File;
import java.io.IOException;

public class RoverException extends Exception{
	
	public RoverException() {
		super();
	}
	
	public RoverException(String str) {
		super(str);
	}
	
	public String getMessage() {
		return String.format("Exceção geral do rover");
	}

}
