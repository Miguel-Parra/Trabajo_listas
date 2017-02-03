package com.epn;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lista_Estudiantes lista= new Lista_Estudiantes();
lista.insertarAlFrente("Miguel", 172554662);
lista.insertarAlFrente("Gissel", 172554662);
lista.insertarAlFrente("Pamela", 24455454);
lista.insertarAlFrente("Angel", 17554545);

System.out.println(lista);
long buscar=1755454;
System.out.println(lista.revisar(buscar));
	
//-------------------------------------------------------------

Lista_Compra comp= new Lista_Compra();
comp.insertar("Sardina", 8);
comp.insertar("Fideo");
comp.insertar("Mantequilla", 9);
comp.insertar("Aceite");
comp.insertar("Leche");
comp.insertar("Atun",8);
System.out.println(comp.toString());

if(comp.imprimirIncompleto().compareToIgnoreCase("")==0){
	System.out.println("No existe productos incompletos");
	}else{System.out.println("------------------------\nPRODUCTOS INCOMPLETOS:"+comp.imprimirIncompleto()+"\n------------------------");
}
}
	
	
	}

