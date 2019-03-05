package org.cvtc.shapes;

// Make the CylinderShape a subclass of Shape
public class CylinderShape extends Shape implements Renderer {

	// state variables
	float radius = 5.0f;
	float height = 5.0f;
	public Dialog message = new MessageBox();
	
	// state getters and setters to get the data and set it.
	
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	// Call the methods from the shape class
	@Override
	public float surfaceArea() {
		// TODO Auto-generated method stub
		if(this.radius >= 0) {
			return (float) ((2*Math.PI*this.radius)*this.height+2*Math.PI*Math.pow(this.radius, 2));
		} else {
			return 0;
		}
	}
	
	@Override
	public float volume() {
		// TODO Auto-generated method stub
		if(this.radius >= 0) {
			return (float) (this.height*Math.PI*Math.pow(this.radius, 2));
		} else {
			return 0;
		}
	}
	
	@Override
	public void render() {
		// TODO Auto-generated method stub
		message.show("The Cylinder has a radius of " + this.radius 
				+ " height of " + this.height + " a surface area of " + surfaceArea() 
				+ " Square feet, and a volume of " + volume(), "Cylinder");
	}

}
