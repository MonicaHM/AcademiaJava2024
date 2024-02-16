package com.curso.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @Test
    void testLeafConstante(){
        double constant = 5.0;
        Component c = new Leaf(constant);
        assertEquals(constant, c.execute());
    }

    @Test
    void testCompositeAddition(){
        double x = 5.0;
        double y = 10.0;
        Component c = new CompositeAddition(new Leaf(x), new Leaf(y));
        assertEquals(x + y, c.execute());
    }

    @Test
    void testCompositeSubtraction(){
        double x = 5.0;
        double y = 10.0;
        Component c = new CompositeSubtraction(new Leaf(x), new Leaf(y));
        assertEquals(x - y, c.execute());
    }

    @Test
    void testCompositeMultiplication(){
        double x = 5.0;
        double y = 10.0;
        Component c = new CompositeMultiplication(new Leaf(x), new Leaf(y));
        assertEquals(x * y, c.execute());
    }

    @Test
    void testCompositeDivision(){
        double x = 5.0;
        double y = 10.0;
        Component c = new CompositeDivision(new Leaf(x), new Leaf(y));
        assertEquals(x / y, c.execute());
    }

    @Test
    void testComplexAddition(){
        double x = 5.0;
        double y = 10.0;
        double z  = 15.0;
        Component c = new CompositeAddition(
                new Leaf(x),
                new CompositeAddition(
                        new Leaf(y),
                        new Leaf(z)
                )
        );
        assertEquals(x + y + z, c.execute());
    }

    @Test
    void  testComplexOperation(){
        double v = 2.0;
        double w = 8.0;
        double x = 5.0;
        double y = 10.0;
        double z  = 15.0;

        Component c = new CompositeMultiplication(
                new CompositeAddition(
                        new Leaf(v),
                        new Leaf(w)
                ),
                new CompositeSubtraction(
                        new Leaf(x),
                        new CompositeDivision(
                                new Leaf(y),
                                new Leaf(z)
                        )
                )
        );
        assertEquals((v + w) * (x - (y/z)), c.execute());
    }
}