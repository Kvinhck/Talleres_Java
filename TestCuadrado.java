package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado r1 = new Cuadrado();
		
		r1.lado = 4;
		double resultadoAreaCuadrado = r1.CalcularArea();
		System.out.println("Resultado Area del Cuadrado: " + resultadoAreaCuadrado);
		
		Cuadrado r2 = new Cuadrado();
		
		r2.lado = 3;
		double resultadoPerimetroCuadrado = r2.calcularPerimetro();
		System.out.println("Resultado Perimetro del Cuadrado: " + resultadoPerimetroCuadrado);

	}

}
