/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarDecoratorTest {
    Car fixture;

    @Test
    public void shouldAssembleSportsCar() {
        fixture = new SportsCar(new BasicCar());
        String actual = fixture.assemble();
        assertEquals("Sports Car", actual);
    }

    @Test
    public void shouldAssembleLuxuryCar() {
        fixture = new LuxuryCar(new BasicCar());
        String actual = fixture.assemble();
        assertEquals("Luxury Car", actual);
    }

}
