package de.jhbruhn.arithmeticmean.input.impl;

import de.jhbruhn.arithmeticmean.input.Input;

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
