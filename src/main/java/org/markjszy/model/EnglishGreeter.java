package org.markjszy.model;

/**
 * Created by mark on 12/11/14.
 */
public class EnglishGreeter {
    public static String greet(Person p) {
        return "Hello, " + p.getFirstName() + "!";
    }
}
