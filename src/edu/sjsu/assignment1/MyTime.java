package edu.sjsu.assignment1;

public class MyTime {

    public static void main(String[] args) {
	    // write your code here
        printTimeDifference("0120", "1510");
        printTimeDifference("1635", "0250");
    }

    public static void printTimeDifference(String time1, String time2) {
        // convert strings in military (hhmm) to minutes
        int first = convertMilitaryToMins(time1);
        int second = convertMilitaryToMins(time2);
        int difference = second - first;

        // if difference < 0
        //      add 24 hours (24 * 60 minutes) to difference
        if (difference < 0) {
            difference += 24 * 60;
        }

        int hour = difference / 60;
        int min = difference % 60;

        System.out.println(hour + " hour(s) " + min + " minute(s)");
    }

    private static int convertMilitaryToMins(String time) {
        int timeInt = Integer.parseInt(time);
        // hhmm
        int hour = timeInt / 100;
        int min = timeInt % 100;
        return hour * 60 + min;
    }

}
