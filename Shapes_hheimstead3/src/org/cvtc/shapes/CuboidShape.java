package org.cvtc.shapes;

//Make the CuboidShape a subclass of Shape
public class CuboidShape extends Shape implements Renderer {
	
	// state variables
	float width = 5.0f;
	float height = 5.0f;
	float depth = 5.0f;
	public Dialog message = new MessageBox();
	
	// state getters and setters to get the data and set it.
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	// Call the render from the shape class and check for any negative numbers.
	@Override
	public float surfaceArea() {
		// TODO Auto-generated method stub
		if(this.depth >= 0) {
			return (float) (this.width*this.height*this.depth);
		} else {
			return 0;
		}
	}
	
	// made a check for any negative numbers
	@Override
	public float volume() {
		// TODO Auto-generated method stub
		if(this.depth >= 0) {
			return (float) (2*this.depth*this.width+(2*this.width*this.height)+(2*this.depth*this.height));
		} else {
			return 0;
		}
	}
	
	@Override
	public void render() {
		// TODO Auto-generated method stub
		message.show("The Cuboid has a width of " + this.width
				+ " height of " + this.height + " depth of " + this.depth + " a surface area of " 
				+ surfaceArea() + " Square feet, and a volume of " + volume(), "Cuboid");
	}
	
}
