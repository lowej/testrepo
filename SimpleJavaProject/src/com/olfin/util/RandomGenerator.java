package com.olfin.util;

import java.util.Date;
import java.util.Random;

public class RandomGenerator {
	
	public static void main(String args[]){
		
		String randNumber = Integer.toString(new Random(new Date().getTime()).nextInt());
		
		System.out.println("Random string is: " + randNumber);
	}

}
