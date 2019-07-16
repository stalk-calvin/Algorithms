package org.calvin.Arrays;

import org.calvin.Arrays.MeetingRooms.Interval;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeetingRoomsTest {
    private MeetingRooms fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new MeetingRooms();
    }

    @Test
    public void shouldEmptyIntervalReturnZero() throws Exception {
        Interval[] input = new Interval[0];
        assertEquals(0, fixture.minMeetingRooms(input));
    }

    @Test
    public void shouldReturnMinimumMeetingRooms() throws Exception {
        Interval[] input = new Interval[]{
                new Interval(9,10),
                new Interval(10,11),
                new Interval(12,15),
                new Interval(13,15),
                new Interval(4,9),
                new Interval(4,17)
        };
        assertEquals(3, fixture.minMeetingRooms(input));
    }

    @Test
    public void shouldReturnMinimumMeetingRoomsMyWay() throws Exception {
        Interval[] input = new Interval[]{
                new Interval(9,10),
                new Interval(10,11),
                new Interval(12,15),
                new Interval(13,15),
                new Interval(4,9),
                new Interval(4,17)
        };
        assertEquals(3, fixture.minMeetingRoomsMyway(input));
    }
}