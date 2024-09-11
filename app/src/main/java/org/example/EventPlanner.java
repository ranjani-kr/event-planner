package org.example;

import java.util.ArrayList;
import java.util.List;

public class EventPlanner {
        private List<Event> eventList;

        public EventPlanner(){
            this.eventList = new ArrayList<>();
        }

        public List<Event> getEventList(){
            return this.eventList;
        }
        public void addEvent(Event event){
            eventList.add(event);

        }
        public void displayEvent(){
            for (Event event : eventList){
                System.out.println(event);
            }
        }

}
