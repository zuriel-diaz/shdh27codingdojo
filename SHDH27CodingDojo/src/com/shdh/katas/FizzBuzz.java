package com.shdh.katas;

public class FizzBuzz {

	private String result;
	
	public String fizzBuzz(int i) {
		if ( i % 3 == 0 && i % 5 == 0 ) result = "FizzBuzz";
		else if ( i % 3 == 0 ) result = "Fizz";
		else if ( i % 5 == 0 ) result = "Buzz";
		return result;
	}
	

	public void show(){
		for ( int i = 1; i < 100; i++ ){
			if ( i % 3 == 0 && i % 5 == 0 ) System.out.println("FizzBuzz");
			else if ( i % 3 == 0 ) System.out.println("Fizz");
			else if ( i % 5 == 0 ) System.out.println("Buzz");
			else System.out.println(i);
			
		}
	}
	
}
