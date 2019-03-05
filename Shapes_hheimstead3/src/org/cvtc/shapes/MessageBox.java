package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {

	// Overrides all showMessageDialogs
	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.OK_OPTION);
		return (0x00);
	}
	
}
