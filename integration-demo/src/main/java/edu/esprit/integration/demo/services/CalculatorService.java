package edu.esprit.integration.demo.services;

import javax.ejb.Stateless;

@Stateless
public class CalculatorService implements CalculatorServiceLocal {

	@Override
	public long add(long i, long j) {
		
		return i+j;
	}

	@Override
	public long subtract(long i, long j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	@Override
	public long multiply(long i, long j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	@Override
	public double divide(long i, long j) {
		// TODO Auto-generated method stub
		return (double)(i/j);
	}
	

}
