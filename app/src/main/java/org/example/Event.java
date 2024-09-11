package org.example;

public class Event {

    String name;
    String  date;
    String location;
    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }
    public String getName(){
        return name;
    }
    public  String getLocation(){
        return location;
    }
    public  String getDate(){
        return date;
    }

    @Override
    public String toString(){
        return "Event{" +
                "\n name =" + name + ","+
                "\n date = " + date + ","+
                "\n location = " +location + "\n }";
    }

}
