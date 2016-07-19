package com.softpath.mercado;

public class ObtenFruta {
	
	public Market obtenFruta(String fruta){
		if(fruta == null){
			return null;
		}
		if(fruta.equals("Manzana")){
			return new Manzana();
		}
		else if(fruta.equals("Pera")){
			return new Pera();
		}
		else if(fruta.equals("Sandia"))
			return new Sandia();
		
		return null;
	}
	
}
