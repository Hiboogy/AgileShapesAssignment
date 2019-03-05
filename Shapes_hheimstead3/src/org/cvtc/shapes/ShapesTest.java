package org.cvtc.shapes;

public class ShapesTest implements Renderer{

	// Create a main method to display the message prompts from the render method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Making a new message box and set it to dialog 
		// Making shapeFactory
		Dialog messagebox = new MessageBox();
		ShapeFactory shapeFactory = new ShapeFactory(messagebox);
		
		// Making all shapes so they can be rendered
		Shape cuboid1 = shapeFactory.make(ShapeType.Cuboid);
		Shape cylinder1 = shapeFactory.make(ShapeType.Cylinder);
		Shape sphere1 = shapeFactory.make(ShapeType.Sphere);
		
		
		// Rendering all of the objects
		((Renderer) cuboid1).render();
		((Renderer) cylinder1).render();
		((Renderer) sphere1).render();
		
		
		//Earlier shape maker in part 3
		CuboidShape cuboid = new CuboidShape();
		CylinderShape cylinder = new CylinderShape();
		SphereShape sphere = new SphereShape();
		
		// Render part 3
		cuboid.render();
		cylinder.render();
		sphere.render();
		
	}
	
	public void render(){
		// TODO Auto-generated method stub
		CuboidShape cuboid = new CuboidShape();
		CylinderShape cylinder = new CylinderShape();
		SphereShape sphere = new SphereShape();
		
		cuboid.render();
		cylinder.render();
		sphere.render();
	}
	

	

}
