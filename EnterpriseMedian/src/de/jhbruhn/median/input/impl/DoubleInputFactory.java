package de.jhbruhn.median.input.impl;

import de.jhbruhn.median.input.Input;
import de.jhbruhn.median.input.InputFactory;

public class DoubleInputFactory extends InputFactory<Double> {

	@Override
	public Input<Double> createInput(Double[] val) {
		return new DoubleInput(val);
	}

}
