package de.jhbruhn.median;

import java.util.ArrayList;
import java.util.List;

import de.jhbruhn.median.calc.MedianCalculator;
import de.jhbruhn.median.calc.MedianCalculatorFactory;
import de.jhbruhn.median.gui.GUIActionListener;
import de.jhbruhn.median.gui.GUIButton;
import de.jhbruhn.median.gui.GUILabel;
import de.jhbruhn.median.gui.GUITextField;
import de.jhbruhn.median.gui.GUIWindow;
import de.jhbruhn.median.gui.GUIWindowFactory;
import de.jhbruhn.median.input.Input;
import de.jhbruhn.median.input.InputFactory;
import de.jhbruhn.median.result.Result;

public class EnterpriseMedianMainEntryPointFlugzeugManagingDevice implements
		GUIActionListener {

	private GUIWindow window;
	private GUITextField inputTextBox;
	private GUIButton actionButton;
	private GUILabel resultLabel;

	public EnterpriseMedianMainEntryPointFlugzeugManagingDevice() {
		initializeDeliciousGUI();
	}

	private void initializeDeliciousGUI() {
		this.window = GUIWindowFactory.createFactory().createGuiWindow(false);
		
		this.window.setSize(280, 200);
		this.window.setTitle("Enterprise Median");
		
		this.window.addLabel("Enter your numbers here, seperated by commas:",
				10, 10, 0, 0);
		this.inputTextBox = this.window.addTextField(10, 30, 250, 50, true);
		this.actionButton = this.window.addButton("Calculate Median", 10, 85,
				250, 30);

		this.actionButton.addActionListener(this);

		this.resultLabel = this.window.addLabel("", 10, 125, 30, 400);
	}

	@Override
	public void onActionPerformed() {
		try {
			List<Double> d = new ArrayList<Double>();

			for (String s : this.inputTextBox.getText().split(",")) {
				d.add(Double.valueOf(s.trim()));
			}
			Double[] input = new Double[d.size()];
			for (int i = 0; i < input.length; i++)
				input[i] = d.get(i);

			InputFactory<Double> f = null;

			f = InputFactory.getFactory(Double.class);

			Input<Double> i = f.createInput(input);

			MedianCalculator<Double> calculator = MedianCalculatorFactory
					.<Double> getFactory().createMedianCalculator();

			Result<Double> result = calculator.calculate(i);
			this.resultLabel.setText("Nice! The Median of those values is "
					+ (Math.round(result.doubleValue() * 100d) / 100d) + ".");
		} catch (Exception e) {
			this.resultLabel.setText("Those values were invalid!");
		}

	}

	public void doStuffThatMatters() {
		this.window.show();
	}

	public static void main(String[] test) {

		new EnterpriseMedianMainEntryPointFlugzeugManagingDevice()
				.doStuffThatMatters();
	}

}
