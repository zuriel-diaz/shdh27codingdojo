package com.shdh.laboratory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calculadora;
	
	@Before
	public void setUp(){ calculadora = new Calculadora(); }
	
	@After
	public void cleanUp(){ calculadora = null; }
	
	@Test
	public void multiplicar() {
		assertTrue("Debe ser mayor a 0", calculadora.multiplicar(2,4) >= 0);
	}
	
	@Test(timeout=3000)
	public void showNumbers(){
		assertTrue("Debe mostrar todos los numeros desde 0 hasta n en 3s max.",calculadora.show(1000));
	}
	
}
