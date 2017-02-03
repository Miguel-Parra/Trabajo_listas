package com.epn;


public class Lista_Compra {
	private Producto_nodo cabeza;
	private int tama�o;
	
	
	public Lista_Compra(){
		cabeza=null;
		tama�o=0;
		}
		
		
	public boolean estaVacia(){
			if(cabeza==null){
				return true;
			}
			return false;
		}
		
	public void insertar(String nombre){
		if (estaVacia()==true){
			cabeza= new Producto_nodo(nombre);
			tama�o+=1;
		}else {
			cabeza=new Producto_nodo(nombre,cabeza);
			tama�o+=1;
			}}
		

	public void insertar(String nombre, int cantidad){
		if (estaVacia()==true){
			cabeza= new Producto_nodo(nombre,cantidad);
			tama�o+=1;
		}else {
			cabeza=new Producto_nodo(nombre,cantidad,cabeza);
			tama�o+=1;
			}}
	
	public String imprimirIncompleto(){
		String incomp="";
		Producto_nodo a;
		for(a=cabeza;a!=null;a=a.getSiguiente()){
			if (a.getCantidad()==0){
			//if (a.getEstado().compareToIgnoreCase("incompleto")==0){
			incomp+="\n"+a.getNombre();		
	
			}}
		return incomp;
		}


	@Override
	public String toString(){
		String salida="";
	if(estaVacia()){
		salida="La lista no tiene productos";
	}else{
	salida= "---------------------------\nPRODUCTOS DE LA LISTA:\n";
	Producto_nodo n= cabeza;
	while(n !=null){
		salida+="Producto: "+n.getNombre()+"\t\tCantidad: "+n.getCantidad()+"\t\tEstado:"+n.getEstado()+"\n";
		n=n.getSiguiente();
	}}
	return salida+"tama�o= "+tama�o;
		
	}

	}


