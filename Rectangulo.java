package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	public int lado;
	
	public int calcularArea() {
		int area = base * altura;
		return area;
	}
	
	public double CalcularPerimetro() {
		double perimetro = 2 * (base + altura);
		return perimetro;
	}
	
	public double CalcularAreaCuadrado() {
		double area = Math.pow(lado, 2);
		return area;
	}
}
