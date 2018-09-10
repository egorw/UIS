package practic.task2;

import nedis.study.interfaces.t2.core.FractionNumber;
import nedis.study.interfaces.t2.core.FractionNumberOperation;

public class FractionNumberOperationImpl implements FractionNumberOperation {
	
	
	@Override
	public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
		
		return new FractionNumberImpl(a.getDividend() * b.getDivisor() + b.getDividend() * a.getDivisor(),  a.getDivisor() * b.getDivisor());
	}

	@Override
	public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
		
		return new FractionNumberImpl(a.getDividend() * b.getDivisor() - b.getDividend() * a.getDivisor(),  a.getDivisor() * b.getDivisor());
	}

	@Override
	public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
		
		return new FractionNumberImpl(a.getDividend() * b.getDividend(), a.getDivisor() * b.getDivisor());
	}

	@Override
	public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
		
		
		return new FractionNumberImpl(a.getDividend() * b.getDivisor(), a.getDivisor() * b.getDividend());
	}

}
