package de.jhbruhn.arithmeticmean.calc;

import de.jhbruhn.arithmeticmean.input.Input;
import de.jhbruhn.arithmeticmean.result.Result;
import de.jhbruhn.arithmeticmean.result.ResultFactory;

public class DefaultMedianCalculator<T extends Number> implements MedianCalculator<T> {

	@Override
	public Result<T> calculate(Input<T> input) {
		double val = 0;
		for(Number n : input.getInputData()) {
			val += n.doubleValue();
		}
		val /= input.getInputData().length;
		
		Result<T> r = ResultFactory.<T>getFactory().createResult(val);
		return r;
	}

}
