package src.main.java;


public class ClockDisplaySeconds
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    //Extend ClockDisplaySeconds to include a seconds field.
    public ClockDisplaySeconds() {
        seconds = new NumberDisplay(60);
        updateDisplay();
    }
    public ClockDisplaySeconds (int hour, int minute, int second) {
        seconds = new NumberDisplay(60);
        minutes = new NumberDisplay(60);
        hours = new NumberDisplay(24);
        setTime(hour,minute,second);
    }
    public void TimeTickSeconds() {
    seconds.increment();
    if (minutes.getValue() == 0) {
        hours.increment();
    }
    if (seconds.getValue() == 0) {
        minutes.increment();
    }
    updateDisplay();
    }
    public void setTime(int hour, int minute, int second) {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }
    public String getTime() {
        return display;
    }
    public void updateDisplay() {
        String output = "";
        output = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue();
        display = output;
    }
    //Update all methods and parameters to accomodate this change
}
