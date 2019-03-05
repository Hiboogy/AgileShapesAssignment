package ShapesTest;

import static org.junit.Assert.*;

import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.junit.Test;

public class ShapeFactoryTest {

	ShapeFactory shapeFactory = new ShapeFactory(null);
	int[] cuboid = {5,5,5};
	int[] cylinder = {5,5};
	int sphere = 5;
	
	@Test
	public void testValidity() {
		assertNotNull("There is no value here.", shapeFactory.make(ShapeType.Cuboid));
		assertNotNull("There is no value here.", shapeFactory.make(ShapeType.Cylinder));
		assertNotNull("There is no value here.", shapeFactory.make(ShapeType.Sphere));
		
	}
	
	
	@Test
	public void testDialog() {
		assertNotNull("There is no value here.", cuboid);
		assertNotNull("There is no value here.", cylinder);
		assertNotNull("There is no value here.", sphere);
		
		
	}

}
