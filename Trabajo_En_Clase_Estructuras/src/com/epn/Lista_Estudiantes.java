package com.epn;

public class Lista_Estudiantes {
	private Estud_nodo cab;
	private int tama�o;

	public Lista_Estudiantes() {
		cab=null;
		tama�o=0;
	}
	
	
	public boolean estaVacia(){
		if(cab==null){
			return true;
		}
		return false;
	}
	
	
	
	public void insertarAlFrente(String nombre, long ced){
		if (estaVacia()){
		cab= new Estud_nodo(nombre, ced);
		tama�o+=1;
		}else{
			if(buscarElemento(ced)!=true){
				cab= new Estud_nodo(nombre,ced,cab);	
				tama�o+=1;
			}else{
				System.out.println("No es poSible registrar nuevamente al\nestudiante con c�dula "+ced);
				}
		
		}
		
	}
	public String revisar(long dato){
		String a;
		
		if (buscarElemento(dato)==true){
			a="------------------\nEl estudiante con c�dula\n"+dato+" si se encuentra registrado\n---------------------\n\n";
		}else{
			a="---------------------\nEl estudiante con c�dula\n"+dato+" no esta registrado\n----------------------\n\n";
		}
		return a;
		
	}
	
	
	
	

public Boolean buscarElemento(long dato){
	Estud_nodo a;
	for(a=cab;a!=null;a=a.getSiguiente()){
		if (dato==(a.getCedula())){
		return true;	
		}}
	return false;
	}



@Override
public String toString() {
	String salida="";
	if(estaVacia()){
		salida="La lista esta vacia";
	}else{
	salida= "-----------------------\nLista de alumnos:\n";
	Estud_nodo n= cab;
	while(n !=null){
		salida+=n.getNombre()+"  "+n.getCedula()+"\n";
		n=n.getSiguiente();
	}}
	return salida+"tama�o= "+tama�o;
		
	}
			
}
	
	


