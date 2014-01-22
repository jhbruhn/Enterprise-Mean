package de.jhbruhn.arithmeticmean.calc;


public abstract class MedianCalculatorFactory<T extends Number> {
	public abstract MedianCalculator<T> createMedianCalculator();

	public static <D extends Number> MedianCalculatorFactory<D> getFactory() {
		MedianCalculatorFactory<D> ret = new DefaultMedianCalculatorFactory<D>();
		return ret;
	}
}
