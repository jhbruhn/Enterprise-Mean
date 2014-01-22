package de.jhbruhn.median.gui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.jhbruhn.median.gui.GUIActionListener;
import de.jhbruhn.median.gui.GUITextField;

public class SWTTextField implements GUITextField {

	private Text text;

	public SWTTextField(Shell shell, int x, int y, int w, int h,
			boolean isMultiline) {
		text = new Text(shell, isMultiline ? SWT.MULTI : SWT.SINGLE);

		text.setBounds(x, y, w, h);
	}

	@Override
	public void addActionListener(final GUIActionListener l) {
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				l.onActionPerformed();
			}
		});
	}

	@Override
	public String getText() {
		return text.getText();
	}

	@Override
	public void setText(String text) {
		this.text.setText(text);
	}

}
