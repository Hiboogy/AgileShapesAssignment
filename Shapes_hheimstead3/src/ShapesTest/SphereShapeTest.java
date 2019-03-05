package ShapesTest;

import static org.junit.Assert.*;

import org.cvtc.shapes.SphereShape;
import org.junit.Test;

public class SphereShapeTest {
	
	SphereShape sphere = new SphereShape();

	@Test
	public void testRadius() {
		if(sphere.getRadius() >= 0) {
			assertEquals(5.0f, sphere.getRadius(), 0.0);
		} else {
			fail("You have a number less than zero.");
		}
	}

	@Test
	public void testSurfaceArea() {
		assertEquals(235.61944580078125f, sphere.surfaceArea(), 0.0);
		assertSame(SphereShape.class, sphere.getClass());
		assertNotNull("The surface area is not here.", sphere.surfaceArea());
	}
	
	@Test
	public void testVolume() {
		assertEquals(523.5988159179688f, sphere.volume(), 0.0);
		assertSame(SphereShape.class, sphere.getClass());
		assertNotNull("The volume is not here.", sphere.volume());
	}
	
	
}
