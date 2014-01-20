package de.jhbruhn.median.input.impl;

import de.jhbruhn.median.input.Input;

public class DoubleInput implements Input<Double> {

	private Double[] inputData;

	protected DoubleInput(Double[] inputData) {
		this.inputData = inputData;
	}

	@Override
	public Double[] getInputData() {
		return inputData;
	}

}
