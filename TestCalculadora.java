package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		int r1;
		
		r1 = c1.sumar(4, 2);
		
		System.out.println("Resultado de la Suma: "+ r1);
		
		int r2;
		
		r2 = c1.restar(8,7);
		
		System.out.println("Resultado de la Resta: "+ r2);
	}

}
