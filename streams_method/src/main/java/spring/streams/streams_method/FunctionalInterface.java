package spring.streams.streams_method;

import java.util.function.Function;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		//find half value from given value
		Function<Integer, Double> halfVal = i->i/2.0;
		Double updatedVal = halfVal.apply(50);
		System.out.println(updatedVal);
		
		
		
		//given string to UpperCase
		
		Function<String, String> intoUpperCase = String :: toUpperCase;
		
		String value = intoUpperCase.apply("Mahesh Maram");
		System.out.println(value);
		
		//null check
		
		Function<String, String> nullCheck = str -> str == null ? "Enter valid value" : str;
		
		String value1 = nullCheck.andThen(intoUpperCase).apply(null);
	
		System.out.println(value1);
	}
	
	

}
