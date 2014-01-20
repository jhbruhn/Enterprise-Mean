package de.jhbruhn.median.calc;

import de.jhbruhn.median.input.Input;
import de.jhbruhn.median.result.Result;
import de.jhbruhn.median.result.ResultFactory;

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
