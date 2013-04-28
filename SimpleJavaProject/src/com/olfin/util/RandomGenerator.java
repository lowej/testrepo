package com.olfin.util;

import java.util.Date;
import java.util.Random;

public class RandomGenerator {
	
	public static void main(String args[]){
		
		
		long seed = new Date().getTime();
		String randNumber = Integer.toString(new Random(seed).nextInt());
		
		System.out.println("Random string is: " + randNumber);
	}

}
