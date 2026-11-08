package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		System.out.println("====================SUMA====================");
		int r1;
		r1 = c1.sumar(4, 2);
		System.out.println("Resultado de la Suma: "+ r1);
		System.out.println("============================================");
		
		System.out.println("====================RESTA====================");
		int r2;
		r2 = c1.restar(8,7);
		System.out.println("Resultado de la Resta: "+ r2);
		System.out.println("=============================================");
		
		System.out.println("====================MULTIPLICACION====================");
		double r3;
		r3 = c1.multiplicar(10, 5);
		System.out.println("Resultado de la Multiplicacion: "+ r3);
		System.out.println("============================================");
		
		System.out.println("====================DIVISION====================");
		double r4;
		r4 = c1.dividir(10 , 2);
		System.out.println("Resultado de la Division: "+ r4);
		System.out.println("============================================");
		
		System.out.println("====================PROMEDIO====================");
		double r5;
		r5 = c1.promediar(10, 8, 9);
		System.out.println("Resultado del promedio: "+ r5);
		System.out.println("============================================");
		
		System.out.println("==========================MENSAJE==========================");
		c1.mostrarResultado();
		System.out.println("===========================================================");
	}

}
