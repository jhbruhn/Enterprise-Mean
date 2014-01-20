package de.jhbruhn.median.result.impl;

import de.jhbruhn.median.result.Result;
import de.jhbruhn.median.result.ResultFactory;

public class DefaultResultFactory<T extends Number> extends ResultFactory<T> {

	@Override
	public Result<T> createResult(double val) {
		return new DoubleResult<T>(val);
	}

}
