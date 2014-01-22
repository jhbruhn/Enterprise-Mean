package de.jhbruhn.arithmeticmean.input.impl;

import de.jhbruhn.arithmeticmean.input.Input;

public class IntegerInput implements Input<Integer> {
	private Integer[] inputData;

	protected IntegerInput(Integer[] inputData) {
		this.inputData = inputData;
	}

	@Override
	public Integer[] getInputData() {
		return inputData;
	}

}
