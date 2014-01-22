package de.jhbruhn.arithmeticmean.input.impl;

import de.jhbruhn.arithmeticmean.input.Input;
import de.jhbruhn.arithmeticmean.input.InputFactory;

public class DoubleInputFactory extends InputFactory<Double> {

	@Override
	public Input<Double> createInput(Double[] val) {
		return new DoubleInput(val);
	}

}
