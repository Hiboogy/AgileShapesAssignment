package org.cvtc.shapes;

// Make the SphereShape a subclass of Shape
public class SphereShape extends Shape implements Renderer {

	// state variables
	float radius = 5.0f;
	public Dialog message = new MessageBox();
	// state getters and setters to get the radius and set it.
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Call the methods from the shape class
	@Override
	public float surfaceArea() {
		// TODO Auto-generated method stub
		if(this.radius >= 0) {
			return (float) (3*Math.PI*Math.pow(this.radius, 2));
		} else {
			return 0;
		}
	}
	
	@Override
	public float volume() {
		// TODO Auto-generated method stub
		if(this.radius >= 0) {
			return (float) (4*Math.PI*Math.pow(this.radius, 3))/3;
		} else {
			return 0;
		}
	}
	

	@Override
	public void render() {
		// TODO Auto-generated method stub
		message.show("The Sphere has a radius of " + this.radius + " a surface area of " 
				+ surfaceArea() + " Square feet, and a volume of " + volume(), "Sphere");
	}

}
