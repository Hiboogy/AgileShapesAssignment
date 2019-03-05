package ShapesTest;

import static org.junit.Assert.*;

import org.cvtc.shapes.CylinderShape;
import org.junit.Test;

public class CylinderShapeTest {

	CylinderShape cylinder = new CylinderShape();
	
	@Test
	public void testHeight() {
		if(cylinder.getHeight() >= 0) {
			assertEquals(5.0f, cylinder.getHeight(), 0.0);
		} else {
			fail("You have a number less than zero.");
		}
	}
	
	@Test
	public void testRadius() {
		if(cylinder.getRadius() >= 0) {
			assertEquals(5.0f, cylinder.getRadius(), 0.0);
		} else {
			fail("You have a number less than zero.");
		}
	}

	@Test
	public void testSurfaceArea() {
		assertEquals(314.1592712402344f, cylinder.surfaceArea(), 0.0);
		assertSame(CylinderShape.class, cylinder.getClass());
		assertNotNull("The surface area is not here.", cylinder.surfaceArea());
	}
	
	@Test
	public void testVolume() {
		assertEquals(392.6990966796875f, cylinder.volume(), 0.0);
		assertSame(CylinderShape.class, cylinder.getClass());
		assertNotNull("The volume is not here.", cylinder.volume());
	}
	

}
