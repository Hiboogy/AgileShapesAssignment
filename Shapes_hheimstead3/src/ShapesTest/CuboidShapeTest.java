package ShapesTest;

import static org.junit.Assert.*;

import org.cvtc.shapes.CuboidShape;
import org.junit.Test;

public class CuboidShapeTest {

	CuboidShape cuboid = new CuboidShape();
	
	@Test
	public void testHeight() {
		if(cuboid.getHeight() >= 0) {
			assertEquals(5.0f, cuboid.getHeight(), 0.0);
		} else {
			fail("You have a number less than zero.");
		}
	}
	
	@Test
	public void testWidth() {
		if(cuboid.getWidth() >= 0) {
			assertEquals(5.0f, cuboid.getWidth(), 0.0);
		} else {
			fail("You have a number less than zero.");
		}
	}
	
	@Test
	public void testDepth() {
		if(cuboid.getDepth() >= 0) {
			assertEquals(5.0f, cuboid.getDepth(), 0.0);
		} else {
			fail("You have a number less than zero.");
		}
	}

	@Test
	public void testSurfaceArea() {
		assertEquals(125.0f, cuboid.surfaceArea(), 0.0);
		assertSame(CuboidShape.class, cuboid.getClass());
		assertNotNull("The surface area is not here.", cuboid.surfaceArea());
	}
	
	@Test
	public void testVolume() {
		assertEquals(150.0f, cuboid.volume(), 0.0);
		assertSame(CuboidShape.class, cuboid.getClass());
		assertNotNull("The volume is not here.", cuboid.volume());
	}
	

}
