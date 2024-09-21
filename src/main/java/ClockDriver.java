package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test11 = new ClockDisplay();
        String test11Out = test11.getTime();
        System.out.println("No Constructor Test Results = " + test11Out);
        
        ClockDisplay test22 = new ClockDisplay (3, 45);
        String test22Out = test22.getTime();
        System.out.println("argument constructor test results = " + test22Out);
        
        ClockDisplay tickTest11 = new ClockDisplay(3, 32);
        System.out.println("Before First Tick Test = " + tickTest11.getTime());
        tickTest11.timeTick();
        System.out.println("After First Tick Test = " + tickTest11.getTime());
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds tickTest22 = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Before Second Tick Test = " + tickTest22.getTime());
        tickTest22.TimeTickSeconds();
        System.out.println("After Second Tick Test = " + tickTest22.getTime());
        
        ClockDisplaySeconds tickTest33 = new ClockDisplaySeconds(1, 00, 59);
        System.out.println("Before Third Tick Test = " + tickTest33.getTime());
        tickTest33.TimeTickSeconds();
        System.out.println("After Third Tick Test = " + tickTest33.getTime());
        
        
        ClockDisplaySeconds tickTest44 = new ClockDisplaySeconds(1, 3, 59);
        System.out.println("Before Fourth Tick Test = " + tickTest44.getTime());
        tickTest44.TimeTickSeconds();
        System.out.println("After Fourth Tick Test = " + tickTest44.getTime());
        
        ClockDisplaySeconds tickTest55 = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Before Fifth Tick Test = " + tickTest55.getTime());
        tickTest55.TimeTickSeconds();
        System.out.println("After Fifth Tick Test = " + tickTest55.getTime());
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}
