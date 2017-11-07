package app;

import LinkedList.LinkedListDouble;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDouble<Integer> Lista1     = new LinkedListDouble<Integer>();
		LinkedListDouble<Integer> Lista2     = new LinkedListDouble<Integer>();
		Lista1.addstart(4);
		Lista1.addstart(16);
		Lista1.addstart(32);
		
		Lista2.addstart(4);
		Lista2.addstart(16);
		Lista2.addstart(32);
		
		//Lista1.SonIguales(Lista1, Lista2);
		Lista1.ExisteElemento(64);
		Lista1.Ocurrencias(4);
		Lista1.Suma();
		
	}

}
