package com.olfin.util;

import java.util.Date;
import java.util.Random;
import org.apache.log4j.*;
import org.apache.log4j.chainsaw.Main;

public class RandomGenerator {
	
	
	public static final String MINUS="-";
	private static Logger log = Logger.getLogger(RandomGenerator.class);
	
	public static void main(String args[]){
		
		// Configure Log4J
	    PropertyConfigurator.configure(Main.class.getClassLoader()
	                                       .getResource("log4j.properties"));
	    
	    new RandomGenerator().go();
		
		
	}
	
	void go(){
		
		long seed = new Date().getTime();
		String randNumber = Integer.toString(new Random(seed).nextInt());
		if(randNumber.startsWith(MINUS)){
			log.debug("== Negative: "+randNumber+" ==");
			randNumber = randNumber.substring(1, randNumber.length());
		}
		
		log.debug("Random string is: " + randNumber);
		
		log.debug("This does the weather thing");
	}

}
