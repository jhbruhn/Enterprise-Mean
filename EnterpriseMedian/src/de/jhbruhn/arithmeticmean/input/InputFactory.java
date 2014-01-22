package de.jhbruhn.arithmeticmean.input;

import de.jhbruhn.arithmeticmean.exceptions.InvalidInputException;

public abstract class InputFactory<T extends Number> {
	public abstract Input<T> createInput(T[] val);

	@SuppressWarnings("unchecked")
	public static <T extends Number> InputFactory<T> getFactory(Class<?> clazz)
			throws ClassNotFoundException, InvalidInputException,
			InstantiationException, IllegalAccessException {
		if (!clazz.getSuperclass().equals(Number.class))
			throw new InvalidInputException("The input has to be a number!");

		Class<?> inputFactoryClazz = Class.forName(InputFactory.class
				.getPackage().getName()
				+ ".impl."
				+ clazz.getSimpleName()
				+ InputFactory.class.getSimpleName());

		return (InputFactory<T>) inputFactoryClazz.newInstance();
	}

}
