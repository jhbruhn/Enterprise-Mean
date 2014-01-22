package de.jhbruhn.median.gui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

import de.jhbruhn.median.gui.GUIActionListener;
import de.jhbruhn.median.gui.GUIButton;

public class SWTButton implements GUIButton {

	private Button button;

	public SWTButton(Shell shell, String text, int x, int y, int w, int h) {
		button = new Button(shell, SWT.PUSH);
		button.setText(text);
		button.setBounds(x, y, w, h);
	}

	@Override
	public void addActionListener(final GUIActionListener l) {
		button.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				l.onActionPerformed();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
