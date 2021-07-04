import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args) {
    // declare integers
    int hour = 14 ;
    int minute = 33 ;
    int second = 34;
    int numSecondsAfter;
    int endHour= 15;
    int endMinute = 21;
    int endSecond= 24;
    int numSecondsExercise;
    // convert time to seconds
    numSecondsAfter= hour*60*60+minute*60+second;
    numSecondsExercise= endHour*60*60+endMinute*60+endSecond;
    int totalSeconds = 24*60*60;
    int timeEx=numSecondsExercise-numSecondsAfter;
    double perDay=numSecondsAfter*100/totalSeconds;
    System.out.println("Percent of Day over: " + perDay);
    System.out.println("Number of seconds after midnight: " + numSecondsAfter);
   System.out.print("The current time is ");
    System.out.print(hour);
   System.out.print(":");
   System.out.print(minute);
   System.out.print(":");
    System.out.print(":");
    System.out.print(second);
   System.out.println(".");
   System.out.println("Time since exercise began:" + timeEx);
  }
}