/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseTest {
    Reverse fixture;

    @Before
    public void setUp() {
        fixture = new Reverse();
    }

    @Test
    public void reverseString() {
        assertEquals("kcalS", fixture.reverseString("Slack"));
    }

}