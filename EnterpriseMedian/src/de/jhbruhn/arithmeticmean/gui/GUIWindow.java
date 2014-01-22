package de.jhbruhn.arithmeticmean.gui;

public interface GUIWindow {
	public GUIButton addButton(String text, int x, int y, int width, int height);
	public GUILabel addLabel(String text, int x, int y, int width, int height);
	public GUITextField addTextField(int x, int y, int width, int height, boolean isMultiline);
	public void setSize(int width, int height);
	public void setTitle(String title);
	public void show();
}
