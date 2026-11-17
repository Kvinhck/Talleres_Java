package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(4,5);
		
		//r1.setAltura(5);
		//r1.setBase(4);
		int resultadoArea = r1.calcularArea();
		System.out.println("Resultado: " + resultadoArea);
		
		Rectangulo r2 = new Rectangulo(8,2);
		
		//r2.setAltura(8);
		//r2.setBase(2);
		int resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado rectangulo 2: " + resultadoArea2);
		
		Rectangulo r3 = new Rectangulo(2,4);
		
		//r3.setAltura(2);
		//r3.setBase(4);
		double resultadoPerimetro = r3.CalcularPerimetro();
		System.out.println("Resultado perimetro del Rectangulo: " + resultadoPerimetro);
		
	}

}
