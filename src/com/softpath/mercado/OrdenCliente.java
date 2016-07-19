package com.softpath.mercado;

public class OrdenCliente {
	public static void main(String[] args) {
		ObtenFruta obtFruta = new ObtenFruta();
		Market mercado = obtFruta.obtenFruta("Manzana");
		mercado.comprar();
		Market mercado2 = obtFruta.obtenFruta("Sandia");
		mercado2.comprar();
		Market mercado3 = obtFruta.obtenFruta("Pera");
		mercado3.comprar();
		
		
	}
}
