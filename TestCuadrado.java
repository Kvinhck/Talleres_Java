package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado r1 = new Cuadrado();
		r1.setLado(8);
		double resultadoAreaCuadrado = r1.calcularArea();
		double resultadoPerimetroCuadrado = r1.calcularPerimetro();

		Cuadrado r2 = new Cuadrado();
		r2.setLado(3);
		double resultadoAreaCuadrado2 = r2.calcularArea();
		double resultadoPerimetroCuadrado2 = r2.calcularPerimetro();

		Cuadrado r3 = new Cuadrado();
		r3.setLado(9);
		double resultadoAreaCuadrado3 = r3.calcularArea();
		double resultadoPerimetroCuadrado3 = r3.calcularPerimetro();

		System.out.println("Resultado Area del Cuadrado 1: " + resultadoAreaCuadrado);
		System.out.println("Resultado Perimetro del Cuadrado 1: " + resultadoPerimetroCuadrado);

		System.out.println("Resultado Area del Cuadrado 2: " + resultadoAreaCuadrado2);
		System.out.println("Resultado Perimetro del Cuadrado 2: " + resultadoPerimetroCuadrado2);

		System.out.println("Resultado Area del Cuadrado 3: " + resultadoAreaCuadrado3);
		System.out.println("Resultado Perimetro del Cuadrado 3: " + resultadoPerimetroCuadrado3);
	}
}