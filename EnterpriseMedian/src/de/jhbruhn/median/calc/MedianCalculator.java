package de.jhbruhn.median.calc;

import de.jhbruhn.median.input.Input;
import de.jhbruhn.median.result.Result;

public interface MedianCalculator<T extends Number> {
	public Result<T> calculate(Input<T> input);
}
