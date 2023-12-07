package oop;

public class TimeClass {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeClass(int seconds) {
        this.hours = seconds/3600;
        this.minutes = (seconds%3600)/60;
        this.seconds = seconds%3600%60;
    }

    public TimeClass(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int secondsInInterval(){
        return hours*3600+minutes*60+seconds;
    }
    public TimeClass sum(TimeClass timeClass){
        return new TimeClass(this.secondsInInterval()+timeClass.secondsInInterval());
    }
    public void printResult(){
        System.out.println(String.format("Hours %s, minutes %s, seconds %s",hours,minutes,seconds));
    }
}
