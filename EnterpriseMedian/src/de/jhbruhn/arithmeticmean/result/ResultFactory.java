package de.jhbruhn.arithmeticmean.result;

import de.jhbruhn.arithmeticmean.result.impl.DefaultResultFactory;

public abstract class ResultFactory<T extends Number> {
	public abstract Result<T> createResult(double val);

	public static <T extends Number> ResultFactory<T> getFactory() {
		ResultFactory<T> ret = new DefaultResultFactory<T>();
		return ret;
	}
}
