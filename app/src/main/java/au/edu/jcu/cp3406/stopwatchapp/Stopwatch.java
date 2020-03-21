package au.edu.jcu.cp3406.stopwatchapp;

public class Stopwatch {
    private int hours;
    private int minutes;
    private int seconds;

    public Stopwatch() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Stopwatch(String time) {
        String[] split_time = time.split(":");
        this.hours = Integer.parseInt(split_time[0]);
        this.minutes = Integer.parseInt(split_time[1]);
        this.seconds = Integer.parseInt(split_time[2]);
    }

    public void setTime(String sting) {
        String[] time = sting.split(":");
        this.hours = Integer.parseInt(time[0]);
        this.minutes = Integer.parseInt(time[1]);
        this.seconds = Integer.parseInt(time[2]);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
    }

}
