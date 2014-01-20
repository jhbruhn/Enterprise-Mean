package de.jhbruhn.median;

import de.jhbruhn.median.calc.MedianCalculator;
import de.jhbruhn.median.calc.MedianCalculatorFactory;
import de.jhbruhn.median.exceptions.InvalidInputException;
import de.jhbruhn.median.input.Input;
import de.jhbruhn.median.input.InputFactory;
import de.jhbruhn.median.result.Result;

public class Main {
	public static void main(String[] test) throws ClassNotFoundException,
			InvalidInputException, InstantiationException,
			IllegalAccessException {
		
		Double[] input = new Double[] { 42d, 0d, 1d };
		
		
		InputFactory<Double> f = InputFactory.getFactory(Double.class);
		Input<Double> i = f.createInput(input);
		
		MedianCalculator<Double> calculator = MedianCalculatorFactory.<Double>getFactory().createMedianCalculator();
		
		Result<Double> result = calculator.calculate(i);
		
		System.out.println(result.doubleValue());
	}

}
