package com.epn;

public class Producto_nodo {
	private String nombre;
	private int cantidad;
	private String estado;
	private Producto_nodo siguiente;
	
	public Producto_nodo(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.estado= "Listo";
		this.siguiente = null;
		
	}
	public Producto_nodo(String nombre, int cantidad, Producto_nodo siguiente) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.siguiente = siguiente;
		this.estado= "Listo";
	}
	
	
	
	public Producto_nodo(String nombre) {
		this.nombre = nombre;
		this.cantidad = 0;
		this.siguiente = null;
		this.estado= "Incompleto";
	
}
	public Producto_nodo(String nombre, Producto_nodo siguiente) {
		this.nombre = nombre;
		this.cantidad = 0;
		this.siguiente = siguiente;
		this.estado= "Incompleto";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Producto_nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Producto_nodo siguiente) {
		this.siguiente = siguiente;
	}

}
