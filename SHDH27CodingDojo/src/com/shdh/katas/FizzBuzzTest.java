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
	
	// Debe mostrar todo en menos de 1 milisegundo :-D
	@Test(timeout=1)
	public void show(){
		fizzBuzz.show();
	}

}
