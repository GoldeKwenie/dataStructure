/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_1;

/**
 *
 * @author Asus
 */
public class Time {

    private int hour;
    private int minute;

    // Constructor
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    // Convert to total minutes for easier comparison
    public int getTotalMinutes() {
        return (hour * 60) + minute;
    }

    // Display time in HH:MM format
    public void displayTime() {
        System.out.printf("Time: %02d:%02d\n", hour, minute);
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}


