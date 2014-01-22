package de.jhbruhn.median.gui.swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import de.jhbruhn.median.gui.GUIButton;
import de.jhbruhn.median.gui.GUILabel;
import de.jhbruhn.median.gui.GUITextField;
import de.jhbruhn.median.gui.GUIWindow;

public class SWTWindow implements GUIWindow {

	private Display display;
	private Shell shell;

	protected SWTWindow() {
		display = new Display();
		shell = new Shell(display);
	}

	@Override
	public GUIButton addButton(String text, int x, int y, int width, int height) {
		return new SWTButton(shell, text, x, y, width, height);
	}

	@Override
	public GUILabel addLabel(String text, int x, int y, int width, int height) {
		return new SWTLabel(shell, text, x, y, width, height);
	}

	@Override
	public GUITextField addTextField(int x, int y, int width, int height,
			boolean isMultiline) {
		return new SWTTextField(this.shell, x, y, width, height, isMultiline);
	}

	@Override
	public void setSize(int width, int height) {
		this.shell.setSize(width, height);
	}

	@Override
	public void show() {
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	@Override
	public void setTitle(String title) {
		this.shell.setText(title);
	}

}
