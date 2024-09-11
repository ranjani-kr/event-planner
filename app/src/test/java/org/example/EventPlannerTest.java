package org.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EventPlannerTest {

    @Test
    private void testAddEvent(){
        EventPlanner eventPlanner = new EventPlanner();
        Event event = new Event("Conference","3-3-2023","");
        eventPlanner.addEvent(event);
        assertEquals(1, eventPlanner.getEventList().size());
        assertEquals(event,eventPlanner.getEventList().get(0));

    }

}
