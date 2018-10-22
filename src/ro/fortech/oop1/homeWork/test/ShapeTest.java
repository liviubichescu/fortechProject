package ro.fortech.oop1.homeWork.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.fortech.oop1.homeWork.shape.Shape;

import static org.junit.Assert.*;

public class ShapeTest {

    Shape testShape;

    @Before
    public void setUp() throws Exception {
        testShape = new Shape();
        testShape.setColor("black");
        testShape.setFilled(false);
    }

    @After
    public void tearDown() throws Exception {
        testShape = null;
    }

    @Test
    public void getColorShape_ExistingColorGiven_ShouldPass() {
        assertEquals("black", testShape.getColor());
        assertNotEquals("white", testShape.getColor());
    }

    @Test
    public void setColorShape_NewColorGiven_ShouldPass() {
        testShape.setColor("white");
        assertEquals("white", testShape.getColor());
        assertNotEquals("black", testShape.getColor());
    }

    @Test
    public void isFilledShape_ExistingFilled_ShouldPass() {
        assertFalse(testShape.isFilled());
    }

    @Test
    public void setFilledShape_NewFilledGiven_ShouldPass() {
        testShape.setFilled(true);
        assertTrue( testShape.isFilled());
    }

}