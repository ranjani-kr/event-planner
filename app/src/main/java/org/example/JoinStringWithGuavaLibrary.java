package org.example;
import com.google.common.base.Joiner;
import java.util.Arrays;

public class JoinStringWithGuavaLibrary {


    public static void main(String[] args) {
        String joinedString = Joiner.on(", ").join(Arrays.asList("Event Planner", "Awesome Course", "Learning Gradle"));

        System.out.println(joinedString);
    }
}