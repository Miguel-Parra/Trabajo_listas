package com.epn;

public class Estud_nodo {
private String nombre;
private long cedula;
private Estud_nodo siguiente;



public Estud_nodo(String nombre, long cedula) {
	
	this.nombre = nombre;
	this.cedula = cedula;
	this.siguiente = null;
}




public Estud_nodo(String nombre, long cedula, Estud_nodo siguiente) {
	
	this.nombre = nombre;
	this.cedula = cedula;
	this.siguiente = siguiente;
}




public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public long getCedula() {
	return cedula;
}



public void setCedula(long cedula) {
	this.cedula = cedula;
}



public Estud_nodo getSiguiente() {
	return siguiente;
}



public void setSiguiente(Estud_nodo siguiente) {
	this.siguiente = siguiente;
}










	
}
