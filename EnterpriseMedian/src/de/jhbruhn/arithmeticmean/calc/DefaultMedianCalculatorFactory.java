package de.jhbruhn.arithmeticmean.calc;


public class DefaultMedianCalculatorFactory<T extends Number> extends
		MedianCalculatorFactory<T> {

	@Override
	public MedianCalculator<T> createMedianCalculator() {
		return new DefaultMedianCalculator<T>();
	}

}
