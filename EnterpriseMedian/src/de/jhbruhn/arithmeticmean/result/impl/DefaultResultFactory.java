package de.jhbruhn.arithmeticmean.result.impl;

import de.jhbruhn.arithmeticmean.result.Result;
import de.jhbruhn.arithmeticmean.result.ResultFactory;

public class DefaultResultFactory<T extends Number> extends ResultFactory<T> {

	@Override
	public Result<T> createResult(double val) {
		return new DoubleResult<T>(val);
	}

}
