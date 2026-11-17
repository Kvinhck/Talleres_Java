package com.krakedev;

public class Calculadora {
	
	public int sumar(int a, int b) {
		
		int resultado = a + b;
		
		return resultado;
	}
	
	public double restar(double a, double b) {
		
		double resultado = a - b;
		
		return resultado;
	}
	
	public double multiplicar(double valor1, double valor2) {
		double resultado = valor1 * valor2;
		return resultado;
	}
	
	public double dividir(double dividendo, double divisor) {
		double resultado = dividendo / divisor;
		return resultado;
	}
	
	public double promediar(double valor1, double valor2, double valor3) {
		double resultado = (valor1 + valor2 + valor3)/3;
		return resultado;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}
	
	public double descuento(double precio, double descuento) {
		double resultado = precio - (precio * descuento/100);
		return resultado;
	}
}
