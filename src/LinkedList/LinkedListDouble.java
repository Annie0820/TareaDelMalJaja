package LinkedList;

import node.node;

public class LinkedListDouble<T> {
	private node<T> start = null, end = null;
	int suma =0;
	public LinkedListDouble(){
		start = new node<T>();
		start.setIndex(-1);
		end = new node<T>();
		end.setIndex(-1);
	}
	
	public LinkedListDouble(T value){
		this();
		start.setNext(new node<T>(value));
		start.getNext().setIndex(0);
		end.setBack(start.getNext());
	}
	
	public void addstart(T value){
		node<T> tmp = start.getNext();
		start.setNext(new node<T>(value));
		if (tmp == null){
			start.getNext().setIndex(0);
			end.setBack(start.getNext());
		} 
		else{
			start.getNext().setNext(tmp);
			tmp.setBack(start.getNext());
		}
	}
	
	public boolean SonIguales(node<T> Lista1, node<T> Lista2){
		
		if(Lista1.getNext().getValue() != Lista2.getNext().getValue()){
			return false;
		}
		else{
			return SonIguales(Lista1,Lista2);
		}
	}
	
	public node<T> ExisteElemento (T value){
		return ExisteElemento (value, start);
	}
	private node<T> ExisteElemento (T value, node<T> lista){
		if (lista.getNext() == null){
			return null;
		}
		if(lista.getNext().getValue().equals(value)){
			return lista.getNext();
		}
		return ExisteElemento(value, lista.getNext());
	}
	public int Ocurrencias(T value){
		int cont  = 0;
		return Ocurrencias(start,value,cont);
	}
	private int Ocurrencias(node<T> start, T value, int cont){
		if(start.getValue().equals(value)){
			return cont++;
		}else{//si es diferente vuelve a comprobar
			return Ocurrencias(start.getNext(),value,cont);
		}
	}
	
	private int Suma (node<T> start, node<T> end, int suma){
		if(start.getValue().equals(end.getValue())){
			return suma + (int)start.getValue();
		}else{
			if(start.getNext().equals(end.getValue()) && end.getBack().equals(start.getValue())){
				return suma + (int) start.getValue() + (int)end.getValue();
			}
			return Suma(start.getNext(),end.getBack(),suma);
		}
	}
	
	public int Suma(){
		return Suma(start.getNext(), end.getBack(),suma);
	}
}