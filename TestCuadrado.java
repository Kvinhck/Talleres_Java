package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado r1 = new Cuadrado();
		r1.lado = 4;
		double resultadoAreaCuadrado = r1.CalcularArea();
		double resultadoPerimetroCuadrado = r1.calcularPerimetro();
		
		Cuadrado r2 = new Cuadrado();
		r2.lado = 3;
		double resultadoAreaCuadrado2 = r2.CalcularArea();
		double resultadoPerimetroCuadrado2 = r2.calcularPerimetro();
		
		Cuadrado r3 = new Cuadrado();
		r3.lado = 5;
		double resultadoAreaCuadrado3 = r3.CalcularArea();
		double resultadoPerimetroCuadrado3 = r3.calcularPerimetro();
		
		System.out.println("Resultado Area del Cuadrado 1: " + resultadoAreaCuadrado);
		System.out.println("Resultado Perimetro del Cuadrado 1: " + resultadoPerimetroCuadrado);
		
		System.out.println("Resultado Area del Cuadrado 2: " + resultadoAreaCuadrado2);
		System.out.println("Resultado Perimetro del Cuadrado 2: " + resultadoPerimetroCuadrado2);
		
		System.out.println("Resultado Area del Cuadrado 3: " + resultadoAreaCuadrado3);
		System.out.println("Resultado Perimetro del Cuadrado 3: " + resultadoPerimetroCuadrado3);


	}

}
