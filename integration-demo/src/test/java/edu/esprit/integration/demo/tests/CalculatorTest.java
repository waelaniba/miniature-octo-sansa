package edu.esprit.integration.demo.tests;

import javax.ejb.EJB;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.esprit.integration.demo.services.CalculatorServiceLocal;

public class CalculatorTest {

	@EJB
	CalculatorServiceLocal calculatorServiceLocal;
	
	@Before
	public void setup(){
		
	}

	@Test
	public void itshouldAddCorrectly(){
		
		Assert.assertEquals(5, calculatorServiceLocal.add(2, 3));
	}




}
