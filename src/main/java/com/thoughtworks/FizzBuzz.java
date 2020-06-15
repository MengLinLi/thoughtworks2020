package com.thoughtworks;

public class FizzBuzz {

	public static String fizzBuzz(int number) {
        StringBuilder stringBuilder=new StringBuilder();
        if(number%3 == 0){
            stringBuilder.append("Fizz");
        }
        if(number%5 == 0){
            stringBuilder.append("Buzz");
        }
        if(stringBuilder.length()==0) {
			stringBuilder.append(String.valueOf(number));
		}
        return stringBuilder.toString();
	}

}
