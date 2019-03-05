package org.cvtc.shapes;

public class ShapeFactory {
	
	private Dialog dialog;

	public Dialog getDialog() {
		return dialog;
	}

	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public ShapeFactory(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public Shape make(ShapeType type) {
		
		if(type == null) {
			return null;
		}
		if (type == type.Cuboid) {
			return new CuboidShape();
		} else if (type == type.Cylinder) {
			return new CylinderShape();
		} else if (type == type.Sphere) {
			return new SphereShape();
		}
		
		return null;
		
	}
	
}
