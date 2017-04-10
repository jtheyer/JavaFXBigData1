/**
 *
 * @author 55heyerjt01
 */
package datastructuretester;

public class MyTimer {

    private static long startTime = 0;
    private static long startNanoTime = 0;

    public static void startTime() {
        startTime = System.currentTimeMillis();

    }

    public static long stopTime() { //Lapse time (could rename to lapseTime()
        return System.currentTimeMillis() - startTime;
    }

    public static void startMicroTime() {
        startNanoTime = System.nanoTime();
    }

    public static long stopMicroTime() {
        return System.nanoTime() - startNanoTime / 1000;
    }

    
    
}
