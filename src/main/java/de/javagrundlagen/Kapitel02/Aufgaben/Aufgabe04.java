package de.javagrundlagen.Kapitel02.Aufgaben;

public class Aufgabe04 {

    public static void main(String[] args) {

        int daysInJanuary = 31;
        int hoursInADay = 24;
        int minutesInAnHour = 60;
        int secondsInAMinute = 60;

        int secondsInJanuary = daysInJanuary * hoursInADay * minutesInAnHour * secondsInAMinute;

        System.out.println("January has " + secondsInJanuary + " seconds.");
    }
}
