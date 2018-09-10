package practic.task2;

import nedis.study.interfaces.t2.core.FractionNumber;

public class FractionNumberImpl implements FractionNumber {
	
	private int dividend;
	private int divisor = DEFAULT_DIVISOR_VALUE;
	
	



	public FractionNumberImpl(int dividend, int divisor) {
		super();
		this.dividend = dividend;
		this.divisor = divisor;
	}
	


	@Override
	public void setDividend(int divident) {
		this.dividend = divident;
	}

	@Override
	public int getDividend() {
		
		return dividend;
	}

	@Override
	public void setDivisor(int divisor) throws IllegalArgumentException {
		this.divisor = divisor;

	}

	@Override
	public int getDivisor() {
		
		return divisor;
	}

	@Override
	public double value() {
		
		double result = (double)this.dividend/(double)this.divisor;
		
		return result;
	}
	
	@Override
	public String toString() {
		return getDividend() + "/" + getDivisor() + " (" + value() + ") ";
	}

}
