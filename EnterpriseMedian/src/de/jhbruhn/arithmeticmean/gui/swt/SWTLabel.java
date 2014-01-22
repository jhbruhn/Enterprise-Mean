package de.jhbruhn.arithmeticmean.gui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import de.jhbruhn.arithmeticmean.gui.GUILabel;

public class SWTLabel implements GUILabel {

	private Label label;

	protected SWTLabel(Shell shell, String text, int x, int y, int w, int h) {
		label = new Label(shell, SWT.NONE);
		label.setText(text);
		label.setBounds(x, y, w, h);
		label.pack();
	}

	@Override
	public void setText(String text) {
		label.setText(text);
		label.pack();
	}

	@Override
	public String getText() {
		return label.getText();
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		label.setBounds(x, y, width, height);
		
	}

}
