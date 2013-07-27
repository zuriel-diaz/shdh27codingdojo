package com.shdh.katas;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	@Before
	public void setUp(){
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void fizzbuzz() {
		assertEquals("Debe mostrar FizzBuzz ", "FizzBuzz", fizzBuzz.fizzBuzz(15));
		assertEquals("Debe mostrar Fizz", "Fizz", fizzBuzz.fizzBuzz(3));
		assertEquals("Debe mostrar Buzz", "Buzz", fizzBuzz.fizzBuzz(5));
	}
	
	// Debe mostrar todo en menos de 10 milisegundos :-D
	@Test(timeout=10)
	public void show(){
		fizzBuzz.show();
	}

}
