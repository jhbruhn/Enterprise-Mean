package de.jhbruhn.median.result;

public interface Result<T extends Number> {
	public int intValue();
	public double doubleValue();
	public float floatValue();
	public short shortValue();
	public byte byteValue();
}
