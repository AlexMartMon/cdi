package com.tsystems.tu;

import java.util.ArrayList;

import javax.inject.Inject;

import com.tsystems.tu.negocio.logica.ColisionBO;

public class Main {
	
	@Inject
	private static ColisionBO colisionBO;

	public static void main(String[] args) {
		colisionBO.contarPuertas(new ArrayList<>());
		
	}

}
