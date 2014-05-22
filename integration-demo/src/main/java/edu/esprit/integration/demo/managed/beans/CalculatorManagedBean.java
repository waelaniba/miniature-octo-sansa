package edu.esprit.integration.demo.managed.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import edu.esprit.integration.demo.services.CalculatorServiceLocal;

@ManagedBean
@ViewScoped
public class CalculatorManagedBean {

	@EJB
	CalculatorServiceLocal calculatorService;

	private long i, j;
	private double result;
	private int operator;

	public void calculate() {

		switch (operator) {
		case 1:
			result = calculatorService.add(i, j);
			break;
		case 2:
			result = calculatorService.subtract(i, j);
			break;
		case 3:
			result = calculatorService.multiply(i, j);
			break;
		case 4:
			result = calculatorService.divide(i, j);
			break;
		default:
			break;
		}
		
	}

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}

	public long getJ() {
		return j;
	}

	public void setJ(long j) {
		this.j = j;
	}

	public int getOperator() {
		return operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
