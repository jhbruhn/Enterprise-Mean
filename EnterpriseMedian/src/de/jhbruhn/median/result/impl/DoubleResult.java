package de.jhbruhn.median.result.impl;

import de.jhbruhn.median.result.Result;

public class DoubleResult<T extends Number> implements Result<T> {
	private Double doubleVal;

	protected DoubleResult(Double val) {

		this.doubleVal = val;
	}

	@Override
	public int intValue() {
		return doubleVal.intValue();
	}

	@Override
	public double doubleValue() {
		return doubleVal.doubleValue();
	}

	@Override
	public float floatValue() {
		return doubleVal.floatValue();
	}

	@Override
	public short shortValue() {
		return doubleVal.shortValue();
	}

	@Override
	public byte byteValue() {
		return doubleVal.byteValue();
	}

}
