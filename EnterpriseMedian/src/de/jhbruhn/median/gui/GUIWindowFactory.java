package de.jhbruhn.median.gui;

import de.jhbruhn.median.gui.swt.SWTWindow;

public class GUIWindowFactory {
	public GUIWindow createGuiWindow(boolean res) {
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.indexOf("win") > 0) {
			return new SWTWindow(res);
		} else {
			return new SWTWindow(res); //Swing Window will follow soon...
		}
	}

	public static GUIWindowFactory createFactory() {
		return new GUIWindowFactory(); // Okay, das ist echt unnötig...
	}
}
