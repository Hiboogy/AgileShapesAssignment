package org.cvtc.shapes;

public abstract class Shape {

	// Create abstract values for the shape class
		abstract float surfaceArea();
		abstract float volume();
	
	private Dialog message = new MessageBox();
	
	// Get and set the message box
	public Dialog getMessageBox() {
		return message;
	}

	public void setMessageBox(Dialog messageBox) {
		this.message = messageBox;
	}

	// Shape message box
	public Shape() {
		super();
		return;
	}
	
}

