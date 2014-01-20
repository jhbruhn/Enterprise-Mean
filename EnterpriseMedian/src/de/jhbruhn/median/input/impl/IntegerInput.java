package de.jhbruhn.median.input.impl;

import de.jhbruhn.median.input.Input;

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
