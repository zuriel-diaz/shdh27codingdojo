package com.shdh.laboratory;

public class Calculadora {

	private int num;
	
	// El numero regresado es un no. negativo [ failure ]
	public int multiplicar(int a, int b){
		return a*b;
	}
	
	public int sumar(int i, int j) {
		return num;
	}

	// Esta operac—n excede el tiempo establecido (2 segundos) [ failure ]
	public boolean show(int i) {
		for (int num = 0; num < i; num++){
			System.out.println(num);
		}
		return true;
	}
	
	
}
