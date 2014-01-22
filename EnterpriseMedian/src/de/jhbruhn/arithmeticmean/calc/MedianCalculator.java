package de.jhbruhn.arithmeticmean.calc;

import de.jhbruhn.arithmeticmean.input.Input;
import de.jhbruhn.arithmeticmean.result.Result;

public interface MedianCalculator<T extends Number> {
	public Result<T> calculate(Input<T> input);
}
