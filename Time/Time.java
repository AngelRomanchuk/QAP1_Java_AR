package Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second; 
    }

    // Getters and Setts
    public int getTime() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setTime(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second; 
    }

    // To String
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //  Next and Previous Second
    public Time nextSecond() {
        int newSecond = second + 1;
        int newMinute = minute;
        int newHour = hour;

        return new Time(newHour, newMinute, newSecond);
    }

    public Time previousSecond() {
        int newSecond = second - 1;
        int newMinute = minute;
        int newHour = hour;

        return new Time(newHour, newMinute, newSecond);
    }
}