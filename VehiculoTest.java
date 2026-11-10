package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {

		Vehiculo v;
		
		v = new Vehiculo();
		System.out.println("=============Vehiculo 1: Creado=============");
		v.setAnio("2022");
		v.setMarca("Chevrolet");
		v.setModelo("Nuevo");
		
		System.out.println("=============Vehiculo 1: Valores Asignados=============");

		System.out.println("Año: "+v.getAnio());
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modelo: "+v.getModelo());
		
		System.out.println("=============Vehiculo 2: Creado=============");
		Vehiculo v2 = new Vehiculo();
		
		v2.setAnio("2023");
		v2.setMarca("Nissan");
		v2.setModelo("El mas rapido");
		
		System.out.println("=============Vehiculo 1: Valores Asignados=============");
		
		System.out.println("Año: "+v2.getAnio());
		System.out.println("Marca: "+v2.getMarca());
		System.out.println("Modelo: "+v2.getModelo());
	}	 

}
