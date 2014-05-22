package edu.esprit.integration.demo.services;

import javax.ejb.Local;

@Local
public interface CalculatorServiceLocal {

	public long add(long i, long j);
	public long subtract(long i, long j);
	public long multiply(long i, long j);
	public double divide(long i, long j);

}
